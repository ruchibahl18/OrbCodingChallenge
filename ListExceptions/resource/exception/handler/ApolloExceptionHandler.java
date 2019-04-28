package com.orb.framework.wallet.exception.handler;

import com.orb.framework.wallet.RequestInterceptor;
import com.orb.framework.wallet.exception.ApiError;
import com.orb.framework.wallet.exception.ApolloException;
import com.orb.framework.wallet.exception.ErrorCategory;
import com.orb.framework.wallet.exception.ErrorResponse;
import java.util.Collections;
import java.util.Locale;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * Handler for exceptions caused while accessing Apollo.
 */
@ControllerAdvice
public class ApolloExceptionHandler {

  private static final Logger LOGGER = LoggerFactory.getLogger(ApolloExceptionHandler.class);

  private static final String CODE = "20S0913";
  private static final String MESSAGE_KEY =
      "com.orb.framework.wallet.infrastructure.apollo.ApolloTransaction.exception.message";

  @Autowired
  private MessageSource messageSource;

  /**
   * Handles an {@link ApolloException}.
   *
   * @param ex The exception to handle.
   * @param locale The {@link Locale} for the current request.
   * @return The http response.
   */
  @ExceptionHandler(ApolloException.class)
  @Order(Ordered.HIGHEST_PRECEDENCE)
  ResponseEntity<ErrorResponse<ApiError>> handleApolloException(ApolloException ex, Locale locale) {
    RequestInterceptor.setRequestLatency();

    HttpStatus httpStatus = HttpStatus.INTERNAL_SERVER_ERROR;
    String message = messageSource.getMessage(MESSAGE_KEY, null, locale);
    LOGGER.warn(
        new LogContext(
            CODE,
            httpStatus.toString(),
            message).toString(),
        ex);

    ApiError error = new ApiError(ErrorCategory.TRANSACTION_ERROR, CODE, message);
    ErrorResponse<ApiError> errors = new ErrorResponse<>(Collections.singletonList(error));
    return new ResponseEntity<>(errors, httpStatus);
  }
}
