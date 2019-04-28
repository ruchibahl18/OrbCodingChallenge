package com.orb.framework.wallet.exception;

import org.springframework.http.HttpStatus;

/**
 * Class for exceptions caused by an invalid usage of the API by the user. If a sub-class of this
 * exception is thrown, {@link HttpStatus#BAD_REQUEST} will be returned to the user.
 */
public class BusinessException extends WalletException {

  /**
   * Creates a new instance of <code>BusinessException</code>.
   * The response http status is set to 400.
   *
   * @param category The {@link ErrorCategory} of this exception.
   * @param code The error code of this exception.
   * @param messageKey The message key of this exception.
   */
  public BusinessException(ErrorCategory category, String code, String messageKey) {
    this(category, code, messageKey, HttpStatus.BAD_REQUEST);
  }

  /**
   * Creates a new instance of <code>BusinessException</code>.
   * The response http status is set to 400.
   *
   * @param category The {@link ErrorCategory} of this exception.
   * @param code The error code of this exception.
   * @param messageKey The message key of this exception.
   * @param cause The cause of this exception.
   */
  public BusinessException(
      ErrorCategory category,
      String code,
      String messageKey,
      Throwable cause) {
    super(category, code, messageKey, HttpStatus.BAD_REQUEST, cause);
  }

  /**
   * Creates a new instance of <code>BusinessException</code>.
   *
   * @param category The {@link ErrorCategory} of this exception.
   * @param code The error code of this exception.
   * @param messageKey The message key of this exception.
   * @param status The http status to return when this exception is thrown.
   */
  public BusinessException(
      ErrorCategory category,
      String code,
      String messageKey,
      HttpStatus status) {
    this(category, code, messageKey, status, null);
  }

  /**
   * Creates a new instance of <code>BusinessException</code>.
   *
   * @param category The {@link ErrorCategory} of this exception.
   * @param code The error code of this exception.
   * @param messageKey The message key of this exception.
   * @param status The http status to return when this exception is thrown.
   * @param cause The cause of this exception.
   */
  public BusinessException(
      ErrorCategory category,
      String code,
      String messageKey,
      HttpStatus status,
      Throwable cause) {
    super(category, code, messageKey, status, cause);
  }
}
