package com.orb.framework.wallet.exception;

public class UserNotFoundException extends BusinessException {

  private static final ErrorCategory CATEGORY = ErrorCategory.INVALID_REQUEST_ERROR;
  private static final String CODE = "20B0100";
  private static final String MESSAGE_KEY =
      "com.orb.framework.wallet.UnexpectedException.message";

  public UserNotFoundException() {
    super(CATEGORY, CODE, MESSAGE_KEY);
  }

  public UserNotFoundException(Throwable cause) {
    super(CATEGORY, CODE, MESSAGE_KEY, cause);
  }

}
