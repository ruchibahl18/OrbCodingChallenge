package com.orb.framework.wallet.exception.transaction.strategy.coiney;

import com.orb.framework.wallet.exception.BusinessException;
import com.orb.framework.wallet.exception.ErrorCategory;

/**
 * Exception thrown when attempting to a execute a charge while its associated coiney payment is not
 * completed.
 */
@CoineyRetryable
public class InvalidChargePaymentStatusException extends BusinessException {

  private static final ErrorCategory CATEGORY = ErrorCategory.INVALID_REQUEST_ERROR;
  private static final String CODE = "20B0501";
  private static final String MESSAGE_KEY =
      "com.orb.framework.wallet.application.charge.InvalidPaymentStatus.message";

  /**
   * Creates an instance of <code>InvalidChargePaymentStatusException</code>.
   */
  public InvalidChargePaymentStatusException() {
    super(CATEGORY, CODE, MESSAGE_KEY);
  }
}
