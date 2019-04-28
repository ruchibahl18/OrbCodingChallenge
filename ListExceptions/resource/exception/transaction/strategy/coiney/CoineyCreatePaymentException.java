package com.orb.framework.wallet.exception.transaction.strategy.coiney;

import static com.orb.framework.wallet.exception.ErrorCategory.API_ERROR;

import com.orb.framework.wallet.exception.ErrorCategory;
import com.orb.framework.wallet.exception.SystemException;

/**
 * Exception thrown when a Coiney payment is not created successfully.
 */
public class CoineyCreatePaymentException extends SystemException {

  private static final ErrorCategory CATEGORY = API_ERROR;
  private static final String CODE = "50S0000";
  private static final String MESSAGE_KEY =
      "com.orb.framework.wallet.model.charge.CreatePayment.CoineyAPIError.message";

  public CoineyCreatePaymentException() {
    super(CATEGORY, CODE, MESSAGE_KEY);
  }

  /**
   * Creates an instance of <code>CoineyCreatePaymentException</code>.
   *
   * @param cause the original exception that was thrown.
   */
  public CoineyCreatePaymentException(Throwable cause) {
    super(CATEGORY, CODE, MESSAGE_KEY, cause);
  }

}
