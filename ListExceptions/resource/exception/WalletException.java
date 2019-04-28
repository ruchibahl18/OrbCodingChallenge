package com.orb.framework.wallet.exception;

import org.springframework.http.HttpStatus;

/**
 * Abstraction for all exceptions documented and thrown by the wallet application.
 */
public abstract class WalletException extends RuntimeException implements WalletError {

  private final ErrorCategory category;
  private final String code;
  private final String messageKey;
  private final HttpStatus httpStatus;

  /**
   * Creates a new instance of <code>WalletException</code>.
   *
   * @param category The {@link ErrorCategory} of this exception.
   * @param code The error code of this exception.
   * @param messageKey The message key of this exception.
   * @param httpStatus The http status to return when this exception is thrown.
   * @param cause The cause of this exception.
   */
  public WalletException(
      ErrorCategory category,
      String code,
      String messageKey,
      HttpStatus httpStatus,
      Throwable cause) {
    super(cause);
    this.category = category;
    this.code = code;
    this.messageKey = messageKey;
    this.httpStatus = httpStatus;
  }

  /**
   * Creates a new instance of <code>WalletException</code>.
   *
   * @param category The {@link ErrorCategory} of this exception.
   * @param code The error code of this exception.
   * @param messageKey The message key of this exception.
   * @param httpStatus The http status to return when this exception is thrown.
   */
  public WalletException(
      ErrorCategory category,
      String code,
      String messageKey,
      HttpStatus httpStatus) {
    this(category, code, messageKey, httpStatus, null);
  }

  @Override
  public ErrorCategory getCategory() {
    return category;
  }

  @Override
  public String getCode() {
    return code;
  }

  @Override
  public String getMessageKey() {
    return messageKey;
  }

  @Override
  public HttpStatus getHttpStatus() {
    return httpStatus;
  }
}
