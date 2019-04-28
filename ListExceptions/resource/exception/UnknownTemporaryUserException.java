package com.orb.framework.wallet.exception;

import static com.orb.framework.wallet.exception.ErrorCategory.INVALID_REQUEST_ERROR;

/**
 * Created by satoshi on 2018/02/08.
 */
public class UnknownTemporaryUserException extends BusinessException {

  private static final ErrorCategory CATEGORY = INVALID_REQUEST_ERROR;
  private static final String CODE = "20B0006";
  private static final String MESSAGE_KEY =
      "com.orb.framework.wallet.model.user.temporaryuser.Unknown.message";

  public UnknownTemporaryUserException() {
    super(CATEGORY, CODE, MESSAGE_KEY);
  }

  public UnknownTemporaryUserException(Throwable cause) {
    super(CATEGORY, CODE, MESSAGE_KEY, cause);
  }

}
