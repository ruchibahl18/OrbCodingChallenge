package com.orb.framework.wallet.exception.handler;

import com.orb.framework.wallet.RequestInterceptor;
import com.orb.framework.wallet.exception.ApiError;
import com.orb.framework.wallet.exception.BusinessException;
import com.orb.framework.wallet.exception.ErrorCategory;
import com.orb.framework.wallet.exception.ErrorResponse;
import com.orb.framework.wallet.exception.InvalidLoginException;
import com.orb.framework.wallet.exception.SystemException;
import com.orb.framework.wallet.exception.WalletAuthenticationException;
import com.orb.framework.wallet.exception.WalletError;
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
 * This class handles all exceptions thrown by the wallet exception, except exceptions caused by
 * request parameters validation.
 */
@ControllerAdvice
public class WalletExceptionHandler {

  static final String UNKNOWN_EXCEPTION_CODE = "20S0000";
  static final String UNKNOWN_EXCEPTION_KEY =
      "com.orb.framework.wallet.UnexpectedException.message";
  private static final Logger LOGGER = LoggerFactory.getLogger(WalletExceptionHandler.class);

  @Autowired
  private MessageSource messageSource;

  /**
   * Handles any exception that is not handled by another handler.
   *
   * @param ex The exception to handle.
   * @param locale The {@link Locale} for the current request.
   * @return The http response.
   */
  @ExceptionHandler(Throwable.class)
  @Order
  ResponseEntity<ErrorResponse<ApiError>> handleThrowable(Throwable ex, Locale locale) {
    RequestInterceptor.setRequestLatency();
    LOGGER.error(
        new LogContext(
            UNKNOWN_EXCEPTION_CODE,
            HttpStatus.INTERNAL_SERVER_ERROR.toString(),
            "An unknown error occurred.").toString(),
        ex);
    return buildResponse(new UnknownError(), locale);
  }

  /**
   * Handles a {@link SystemException}.
   *
   * @param ex The exception to handle.
   * @param locale The {@link Locale} for the current request.
   * @return The http response.
   */
  @ExceptionHandler(SystemException.class)
  @Order(Ordered.HIGHEST_PRECEDENCE)
  ResponseEntity<ErrorResponse<ApiError>> handleSystemException(SystemException ex, Locale locale) {
    RequestInterceptor.setRequestLatency();
    LOGGER.error(
        new LogContext(
            ex.getCode(),
            ex.getHttpStatus().toString(),
            "A system exception occurred.").toString(),
        ex);
    return buildResponse(ex, locale);
  }

  /**
   * Handles a {@link InvalidLoginException}. {@link WalletAuthenticationException}s that are not
   * {@link InvalidLoginException} are handled by Spring Security and should not be thrown at this
   * level.
   *
   * @param ex The exception to handle.
   * @param locale The {@link Locale} for the current request.
   * @return The http response.
   */
  @ExceptionHandler(InvalidLoginException.class)
  @Order(Ordered.HIGHEST_PRECEDENCE)
  ResponseEntity<ErrorResponse<ApiError>> handleInvalidLoginException(
      WalletAuthenticationException ex, Locale locale) {
    RequestInterceptor.setRequestLatency();
    LOGGER.warn(
        new LogContext(
            ex.getCode(),
            ex.getHttpStatus().toString(),
            "Login failed.").toString(),
        ex);
    return buildResponse(ex, locale);
  }

  /**
   * Handles a {@link BusinessException}.
   *
   * @param ex The exception to handle.
   * @param locale The {@link Locale} for the current request.
   * @return The http response.
   */
  @ExceptionHandler(BusinessException.class)
  @Order(Ordered.HIGHEST_PRECEDENCE)
  ResponseEntity<ErrorResponse<ApiError>> handleBusinessException(
      BusinessException ex, Locale locale) {
    RequestInterceptor.setRequestLatency();
    LOGGER.warn(
        new LogContext(
            ex.getCode(),
            ex.getHttpStatus().toString(),
            "A business exception occurred.").toString(),
        ex);
    return buildResponse(ex, locale);
  }

  private ResponseEntity<ErrorResponse<ApiError>> buildResponse(WalletError ex, Locale locale) {
    String message = messageSource.getMessage(ex, locale);

    ApiError error = new ApiError(ex.getCategory(), ex.getCode(), message);
    ErrorResponse<ApiError> errors = new ErrorResponse<>(Collections.singletonList(error));
    return new ResponseEntity<>(errors, ex.getHttpStatus());
  }

  private static class UnknownError implements WalletError {

    @Override
    public ErrorCategory getCategory() {
      return ErrorCategory.API_ERROR;
    }

    @Override
    public String getCode() {
      return UNKNOWN_EXCEPTION_CODE;
    }

    @Override
    public String getMessageKey() {
      return UNKNOWN_EXCEPTION_KEY;
    }

    @Override
    public HttpStatus getHttpStatus() {
      return HttpStatus.INTERNAL_SERVER_ERROR;
    }
  }
}
