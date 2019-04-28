package com.orb.framework.wallet.exception.limiter;

import com.orb.framework.wallet.exception.ErrorCategory;
import com.orb.framework.wallet.model.limiter.MaxBalanceTransactionLimiter;

/**
 * Exception thrown when a {@link MaxBalanceTransactionLimiter} finds a transaction to put a
 * user's balance over a max amount.
 */
public class MaxBalanceTransactionLimiterException extends TransactionLimiterException {

  private static final ErrorCategory CATEGORY = ErrorCategory.INVALID_REQUEST_ERROR;
  private static final String CODE = "20B0208";
  private static final String MESSAGE_KEY =
      "com.orb.framework.wallet.model.limiter.MaxBalanceExceeded.message";

  /**
   * Creates an instance of <code>MaxBalanceTransactionLimiterException</code>.
   */
  public MaxBalanceTransactionLimiterException() {
    super(CATEGORY, CODE, MESSAGE_KEY);
  }
}
