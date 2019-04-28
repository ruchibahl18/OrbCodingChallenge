package com.orb.framework.wallet.exception.transaction.strategy.coiney;

import static com.orb.framework.wallet.exception.ErrorCategory.API_ERROR;

import com.orb.framework.wallet.exception.SystemException;

/**
 * Thrown when retrieval of payment information from Coiney fails.
 */
public class CoineyGetPaymentException extends SystemException {

  private static final String CODE = "50S0001";
  private static final String MESSAGE_KEY =
      "com.orb.framework.wallet.model.charge.GetPayment.CoineyAPIError.message";

  /**
   * Constructs a new <code>CoineyGetPaymentException</code>.
   *
   * @param cause The cause of the error.
   */
  public CoineyGetPaymentException(Throwable cause) {
    super(API_ERROR, CODE, MESSAGE_KEY, cause);
  }
}
