package com.orb.framework.wallet.exception;

import static com.orb.framework.wallet.exception.ErrorCategory.INVALID_REQUEST_ERROR;

/**
 * Created by satoshi on 2018/01/29.
 */
public class UnknownVerificationCodeException extends BusinessException {

  private static final ErrorCategory CATEGORY = INVALID_REQUEST_ERROR;
  private static final String CODE = "20B0005";
  private static final String MESSAGE_KEY =
      "com.orb.framework.wallet.verification.code.Unknown.message";

  public UnknownVerificationCodeException() {
    super(CATEGORY, CODE, MESSAGE_KEY);
  }

  public UnknownVerificationCodeException(Throwable cause) {
    super(CATEGORY, CODE, MESSAGE_KEY, cause);
  }

}
