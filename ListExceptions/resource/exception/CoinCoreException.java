package com.orb.framework.wallet.exception;

/**
 * Exception thrown when a call to coin core fails for some unexpected reason.
 */
public class CoinCoreException extends SystemException {
  private static final ErrorCategory CATEGORY = ErrorCategory.TRANSACTION_ERROR;
  private static final String CODE = "20S0914";
  private static final String MESSAGE_KEY =
      "com.orb.framework.wallet.model.transaction.CoinCoreExecutionFailure.message";

  /**
   * Creates a new instance of <code>CoinCoreException</code>.
   */
  public CoinCoreException() {
    super(CATEGORY, CODE, MESSAGE_KEY);
  }

  /**
   * Creates a new instance of <code>CoinCoreException</code>.
   *
   * @param cause The cause of this exception.
   */
  public CoinCoreException(Throwable cause) {
    super(CATEGORY, CODE, MESSAGE_KEY, cause);
  }

}
