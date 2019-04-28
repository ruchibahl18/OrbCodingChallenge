package com.orb.framework.wallet.exception;

/**
 * Thrown for errors originating from the virtual currency (VC) service.
 */
public class VirtualCurrencyException extends SystemException {

  public static final String CODE = "40S0200";
  private static final String MESSAGE_KEY =
      "com.orb.framework.wallet.VirtualCurrency.Error.message";

  /**
   * Constructs a new instance of <code>VirtualCurrencyException</code>.
   *
   * @param cause the cause of the error.
   */
  public VirtualCurrencyException(Throwable cause) {
    super(ErrorCategory.API_ERROR, CODE, MESSAGE_KEY, cause);
  }
}
