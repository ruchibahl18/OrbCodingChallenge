package com.orb.framework.wallet.exception;

import static com.orb.framework.wallet.exception.ErrorCategory.INVALID_REQUEST_ERROR;

public class BankAccountDetailsNotSavedException extends BusinessException {

  private static final ErrorCategory CATEGORY = INVALID_REQUEST_ERROR;
  private static final String CODE = "20B0509";
  private static final String MESSAGE_KEY =
      "com.orb.framework.wallet.model.auth.oauth.netbank.BankAccountDetail.NotSaved.message";

  public BankAccountDetailsNotSavedException() {
    super(CATEGORY, CODE, MESSAGE_KEY);
  }

  public BankAccountDetailsNotSavedException(Throwable cause) {
    super(CATEGORY, CODE, MESSAGE_KEY, cause);
  }
}

