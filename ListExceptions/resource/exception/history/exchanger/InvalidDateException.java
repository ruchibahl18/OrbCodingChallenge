package com.orb.framework.wallet.exception.history.exchanger;

import com.orb.framework.wallet.exception.BusinessException;
import com.orb.framework.wallet.exception.ErrorCategory;

public class InvalidDateException extends BusinessException {
  private static final ErrorCategory CATEGORY = ErrorCategory.INVALID_REQUEST_ERROR;
  private static final String CODE = "20B1008";
  private static final String MESSAGE_KEY =
      "com.orb.framework.wallet.model.history.exchange.InvalidDate.message";

  /**
   * Creates an instance of <code>InvalidDateException</code>.
   */
  public InvalidDateException() {
    super(CATEGORY, CODE, MESSAGE_KEY);
  }

  public InvalidDateException(Throwable e) {
    super(CATEGORY, CODE, MESSAGE_KEY, e);
  }
}
