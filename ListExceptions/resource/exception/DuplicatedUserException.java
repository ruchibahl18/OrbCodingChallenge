package com.orb.framework.wallet.exception;

/**
 * Created by satoshi on 2018/01/23.
 */
public class DuplicatedUserException extends BusinessException {

  private static final ErrorCategory CATEGORY = ErrorCategory.INVALID_REQUEST_ERROR;
  private static final String CODE = "20B0004";
  private static final String MESSAGE_KEY = "com.orb.framework.wallet.model.user.Exist.message";

  public DuplicatedUserException() {
    super(CATEGORY, CODE, MESSAGE_KEY);
  }

  public DuplicatedUserException(Throwable cause) {
    super(CATEGORY, CODE, MESSAGE_KEY, cause);
  }

}
