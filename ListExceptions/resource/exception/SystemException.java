package com.orb.framework.wallet.exception;

import org.springframework.http.HttpStatus;

/**
 * Class for exceptions caused by an internal error. The user is not the cause of such an exception.
 * If a sub-class of this exception is thrown, {@link HttpStatus#INTERNAL_SERVER_ERROR} will be
 * returned to the user.
 */
public class SystemException extends WalletException {

  public SystemException(ErrorCategory category, String code, String messageKey) {
    this(category, code, messageKey, null);
  }

  public SystemException(ErrorCategory category, String code, String messageKey, Throwable cause) {
    super(category, code, messageKey, HttpStatus.INTERNAL_SERVER_ERROR, cause);
  }
}
