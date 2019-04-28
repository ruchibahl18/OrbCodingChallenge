package com.orb.framework.wallet.exception.transaction;

import com.orb.framework.wallet.exception.ErrorCategory;
import com.orb.framework.wallet.exception.SystemException;

/**
 * Configuration exception thrown when the name specified in 'strategy' does not
 * correspond to any implemented strategy.
 */
public class TransactionStrategyNotFoundException extends SystemException {

  private static final ErrorCategory CATEGORY = ErrorCategory.API_ERROR;
  private static final String CODE = "20S0915";
  private static final String MESSAGE_KEY =
      "com.orb.framework.wallet.config.transaction.TransactionStrategyNotFound.message";

  /**
   * Creates an instance of <code>TransactionStrategyNotFoundException</code>.
   */
  public TransactionStrategyNotFoundException() {
    super(CATEGORY, CODE, MESSAGE_KEY);
  }
}
