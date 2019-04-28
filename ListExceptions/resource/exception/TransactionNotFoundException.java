package com.orb.framework.wallet.exception;

public class TransactionNotFoundException extends BusinessException {

  private static final ErrorCategory CATEGORY = ErrorCategory.INVALID_REQUEST_ERROR;
  private static final String CODE = "20B0505";
  private static final String MESSAGE_KEY =
      "com.orb.framework.wallet.application.transaction.TransactionNotFound.message";

  /**
   * Creates an instance of <code>TransactionNotFoundException</code>.
   */
  public TransactionNotFoundException() {
    super(CATEGORY, CODE, MESSAGE_KEY);
  }

  /**
   * Creates an instance of <code>TransactionNotFoundException</code> with a specific cause.
   *
   * @param cause the cause of this exception.
   */
  public TransactionNotFoundException(Throwable cause) {
    super(CATEGORY, CODE, MESSAGE_KEY, cause);
  }
}
