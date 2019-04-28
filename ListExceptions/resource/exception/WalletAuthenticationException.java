package com.orb.framework.wallet.exception;

import org.springframework.http.HttpStatus;
import org.springframework.security.core.AuthenticationException;

/**
 * Class for all authentication-related exceptions. It extends <code>AuthenticationException</code>,
 * so any exception that is supposed to be caught by Spring Security should extend this class. If a
 * sub-class of this exception is thrown, {@link HttpStatus#UNAUTHORIZED} will be returned to the
 * user.
 */
public abstract class WalletAuthenticationException extends AuthenticationException implements
    WalletError {

  private final String messageKey;
  private final String code;

  /**
   * Creates a new instance of <code>WalletAuthenticationException</code>.
   *
   * @param messageKey the message key of this exception.
   * @param code the error code of this exception.
   */
  public WalletAuthenticationException(String messageKey, String code) {
    super("authentication failed");
    this.messageKey = messageKey;
    this.code = code;
  }

  public String getCode() {
    return code;
  }

  @Override
  public ErrorCategory getCategory() {
    return ErrorCategory.AUTHENTICATION_ERROR;
  }

  @Override
  public String getMessageKey() {
    return messageKey;
  }

  @Override
  public HttpStatus getHttpStatus() {
    return HttpStatus.UNAUTHORIZED;
  }
}
