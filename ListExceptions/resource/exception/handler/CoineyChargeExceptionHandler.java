package com.orb.framework.wallet.exception.handler;

import com.orb.framework.wallet.application.transaction.coiney.CoineyTransactionController;
import com.orb.framework.wallet.exception.WalletException;
import com.orb.framework.wallet.exception.transaction.strategy.coiney.CoineyRetryable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * This controller advice operates exclusively on the coiney charge execute endpoint.
 * If an exception thrown by the controller is marked as retryable with the {@link CoineyRetryable}
 * annotation, the http status will be set to 200 and the execution not retried.
 * Otherwise, the http status will be set to {@link WalletException#getHttpStatus()} for
 * any {@link WalletException} and 500 for any other throwable, and the webhook will retry.
 */
@ControllerAdvice(assignableTypes = CoineyTransactionController.class)
public class CoineyChargeExceptionHandler {

  private static final Logger LOGGER = LoggerFactory.getLogger(CoineyChargeExceptionHandler.class);

  @ExceptionHandler(Throwable.class)
  @Order
  ResponseEntity handleThrowable(Throwable ex) {
    LOGGER.error("An unexpected error occurred during coiney charge execution.", ex);

    return getResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR, ex);
  }

  @ExceptionHandler(WalletException.class)
  @Order(Ordered.HIGHEST_PRECEDENCE)
  ResponseEntity handleWalletException(WalletException ex) {
    LOGGER.error("A wallet exception occurred during coiney charge execution.", ex);

    return getResponseEntity(ex.getHttpStatus(), ex);
  }

  private ResponseEntity getResponseEntity(HttpStatus httpStatus, Throwable ex) {
    if (ex.getClass().isAnnotationPresent(CoineyRetryable.class)) {
      return new ResponseEntity(httpStatus);
    }
    return new ResponseEntity(HttpStatus.OK);
  }
}
