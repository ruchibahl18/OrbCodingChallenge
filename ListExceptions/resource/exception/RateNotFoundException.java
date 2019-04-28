package com.orb.framework.wallet.exception;

import static com.orb.framework.wallet.exception.ErrorCategory.INVALID_REQUEST_ERROR;

import org.springframework.http.HttpStatus;

/**
 * Thrown when trying to fetch a rate that does not exist.
 */
public class RateNotFoundException extends BusinessException {

  public static final String RATE_NOT_FOUND = "RATE_NOT_FOUND";
  private static final ErrorCategory CATEGORY = INVALID_REQUEST_ERROR;
  private static final String CODE = "20V0466";
  private static final String MESSAGE_KEY =
      "com.orb.framework.wallet.util.VCClient.getCoinRate.RateDoesNotExist.message";

  /**
   * Creates an instance of <code>RateNotFoundException</code>.
   */
  public RateNotFoundException() {
    super(CATEGORY, CODE, MESSAGE_KEY, HttpStatus.NOT_FOUND);
  }

}
