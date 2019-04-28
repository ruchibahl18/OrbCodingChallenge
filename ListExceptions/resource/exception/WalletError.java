package com.orb.framework.wallet.exception;

import org.springframework.context.MessageSourceResolvable;
import org.springframework.http.HttpStatus;

/**
 * Abstraction for errors caused by the wallet application and handled by the exception handler. The
 * handler returns an appropriate http response to the user based on the values delivered by this
 * interface.
 */
public interface WalletError extends MessageSourceResolvable {

  /**
   * The {@link ErrorCategory} of this error.
   *
   * @return The {@link ErrorCategory} of this error.
   */
  ErrorCategory getCategory();

  /**
   * The error code associated with this error (for API documentation).
   *
   * @return The error code associated with this error.
   */
  String getCode();

  /**
   * The message key of this error. The {@link org.springframework.context.MessageSource} of this
   * handler will fetch the error message corresponding to this message key.
   *
   * @return The message key of this error.
   */
  String getMessageKey();

  /**
   * The http status to return when this error is returned.
   *
   * @return The http status to return when this error is returned.
   */
  HttpStatus getHttpStatus();

  /**
   * {@inheritDoc} Default value is the message key of this error.
   */
  @Override
  default String[] getCodes() {
    return new String[]{getMessageKey()};
  }

  /**
   * {@inheritDoc} Default value is the message key of this error.
   */
  @Override
  default String getDefaultMessage() {
    return getMessageKey();
  }
}
