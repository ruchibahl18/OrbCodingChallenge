package com.orb.framework.wallet.exception.user.cashpoint;

import static com.orb.framework.wallet.exception.ErrorCategory.INVALID_REQUEST_ERROR;

import com.orb.framework.wallet.exception.BusinessException;
import com.orb.framework.wallet.exception.ErrorCategory;

/**
 * Thrown when a SessionToken is attempted to be created with the wrong cashpoint id or secret.
 */
public class CashpointLoginFailureException extends BusinessException {

  private static final ErrorCategory CATEGORY = INVALID_REQUEST_ERROR;
  private static final String CODE = "20B0305";
  private static final String MESSAGE_KEY =
      "com.orb.framework.wallet.model.user.cashpoint.CashpointLoginFailure.message";

  public CashpointLoginFailureException() {
    super(CATEGORY, CODE, MESSAGE_KEY);
  }

  public CashpointLoginFailureException(Throwable cause) {
    super(CATEGORY, CODE, MESSAGE_KEY, cause);
  }

}
