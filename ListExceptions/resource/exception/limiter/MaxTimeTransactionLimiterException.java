package com.orb.framework.wallet.exception.limiter;

import com.orb.framework.wallet.exception.ErrorCategory;
import com.orb.framework.wallet.model.limiter.MaxAmountTransactionLimiter;

/**
 * Exception thrown when a {@link MaxTimeTransactionLimiterException} finds a transaction to be over
 * a max allowed time.
 */
public class MaxTimeTransactionLimiterException extends TransactionLimiterException {

  private static final ErrorCategory CATEGORY = ErrorCategory.INVALID_REQUEST_ERROR;
  private static final String CODE = "20B0290";
  private static final String MESSAGE_KEY =
      "com.orb.framework.wallet.model.limiter.MaxTimeExceeded.message";

  /**
   * Creates an instance of <code>MaxTimeTransactionLimiterException</code>.
   */
  public MaxTimeTransactionLimiterException() {
    super(CATEGORY, CODE, MESSAGE_KEY);
  }
}
