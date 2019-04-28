package com.orb.framework.wallet.exception;

/**
 * Exception thrown when an invalid Transaction Status.
 */
public class InvalidTransactionStatusException extends BusinessException {

  private static final ErrorCategory CATEGORY = ErrorCategory.API_ERROR;
  private static final String CODE = "20B0506";
  private static final String MESSAGE_KEY =
      "com.orb.framework.wallet.application.transaction.InvalidTransactionStatus.message";

  /**
   * Creates an instance of <code>InvalidTransactionStatusException</code>.
   */
  public InvalidTransactionStatusException() {
    super(CATEGORY, CODE, MESSAGE_KEY);
  }

}
