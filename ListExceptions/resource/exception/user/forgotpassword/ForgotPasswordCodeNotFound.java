package com.orb.framework.wallet.exception.user.forgotpassword;

import com.orb.framework.wallet.exception.BusinessException;
import com.orb.framework.wallet.exception.ErrorCategory;

/**
 * Exception thrown when the code for the forgot password process can't be found.
 */
public class ForgotPasswordCodeNotFound  extends BusinessException {
  private static final ErrorCategory CATEGORY = ErrorCategory.INVALID_REQUEST_ERROR;
  private static final String CODE = "20V0211";
  private static final String MESSAGE_KEY =
      "com.orb.framework.wallet.UserServiceImpl.RecoverPasswordStepTwo.WrongCode.message";

  public ForgotPasswordCodeNotFound() {
    super(CATEGORY, CODE, MESSAGE_KEY);
  }
}

