package com.orb.framework.wallet.exception.limiter;

import com.orb.framework.wallet.exception.ErrorCategory;
import com.orb.framework.wallet.model.limiter.MaxAmountTransactionLimiter;

/**
 * Exception thrown when a {@link MaxAmountTransactionLimiter} finds a transaction to be over
 * a max amount.
 */
public class MaxAmountTransactionLimiterException extends TransactionLimiterException {

  private static final ErrorCategory CATEGORY = ErrorCategory.INVALID_REQUEST_ERROR;
  private static final String CODE = "20B0207";
  private static final String MESSAGE_KEY =
      "com.orb.framework.wallet.model.limiter.MaxAmountExceeded.message";

  /**
   * Creates an instance of <code>MaxAmountTransactionLimiterException</code>.
   */
  public MaxAmountTransactionLimiterException() {
    super(CATEGORY, CODE, MESSAGE_KEY);
  }
}
