package com.orb.framework.wallet.exception;

public class WrongPasswordException extends BusinessException {

  private static final ErrorCategory CATEGORY = ErrorCategory.AUTHENTICATION_ERROR;
  private static final String CODE = "20V0010";
  private static final String MESSAGE_KEY =
      "com.orb.framework.wallet.model.user.UserService.ChangePassword.OldPassword.Mismatch.message";

  public WrongPasswordException() {
    super(CATEGORY, CODE, MESSAGE_KEY);
  }
}
