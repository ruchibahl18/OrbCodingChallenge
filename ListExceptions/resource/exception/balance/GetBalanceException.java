package com.orb.framework.wallet.exception.balance;

import com.orb.framework.wallet.exception.ErrorCategory;
import com.orb.framework.wallet.exception.SystemException;

/**
 * Exception thrown when an unexpected error occurred when getting the balance of a user failed.
 */
public class GetBalanceException extends SystemException {

  private static final ErrorCategory CATEGORY = ErrorCategory.API_ERROR;
  private static final String CODE = "20S1000";
  private static final String MESSAGE_KEY =
      "com.orb.framework.wallet.model.balance.Failure.message";

  /**
   * Creates an instance of <code>GetBalanceException</code>.
   *
   * @param e The cause of this exception.
   */
  public GetBalanceException(Throwable e) {
    super(CATEGORY, CODE, MESSAGE_KEY, e);
  }
}
