package com.orb.framework.wallet.exception;

/**
 * Exception thrown whenever the client sends a rate request for anything other than "SCOINJPY".
 * TODO: remove when the rate service connects to the real VC
 */
public class WeOnlySupportScoinJpyPairSorryException extends BusinessException {

  private static final ErrorCategory CATEGORY = ErrorCategory.AUTHENTICATION_ERROR;
  private static final String CODE = "40V0010";
  private static final String MESSAGE_KEY =
      "com.orb.framework.wallet.model.rate.RateService.GetRate.UnsupportedRate.message";

  public WeOnlySupportScoinJpyPairSorryException() {
    super(CATEGORY, MESSAGE_KEY, CODE);
  }
}
