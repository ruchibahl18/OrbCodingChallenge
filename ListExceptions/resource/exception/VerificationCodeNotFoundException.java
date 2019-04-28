package com.orb.framework.wallet.exception;

/**
 * Created by satoshi on 2018/01/25.
 */
public class VerificationCodeNotFoundException extends BusinessException {

  private static final ErrorCategory CATEGORY = ErrorCategory.INVALID_REQUEST_ERROR;
  private static final String CODE = "20B0003";
  private static final String MESSAGE_KEY =
      "com.orb.framework.wallet.verification.code.NotFound.message";


  public VerificationCodeNotFoundException() {
    super(CATEGORY, CODE, MESSAGE_KEY);
  }

  public VerificationCodeNotFoundException(Throwable cause) {
    super(CATEGORY, CODE, MESSAGE_KEY, cause);
  }

}
