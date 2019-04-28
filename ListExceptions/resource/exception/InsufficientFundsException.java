package com.orb.framework.wallet.exception;

import static com.orb.framework.wallet.exception.ErrorCategory.INVALID_REQUEST_ERROR;

/**
 * Exception thrown when an transaction fails due to insufficient funds.
 */
public class InsufficientFundsException extends BusinessException {

  private static final ErrorCategory CATEGORY = INVALID_REQUEST_ERROR;
  private static final String CODE = "20B0202";
  private static final String MESSAGE_KEY =
      "com.orb.framework.wallet.application.Transaction.InsufficientFunds.message";

  public InsufficientFundsException() {
    super(CATEGORY, CODE, MESSAGE_KEY);
  }

  public InsufficientFundsException(Throwable cause) {
    super(CATEGORY, CODE, MESSAGE_KEY, cause);
  }
}
