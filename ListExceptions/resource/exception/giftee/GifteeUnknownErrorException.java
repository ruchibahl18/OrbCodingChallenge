package com.orb.framework.wallet.exception.giftee;

import com.orb.framework.wallet.exception.ErrorCategory;
import com.orb.framework.wallet.exception.SystemException;

/**
 * Exception thrown when giftee returns a status error that is not listed in their error API.
 */
public class GifteeUnknownErrorException extends SystemException {

  private static final ErrorCategory CATEGORY = ErrorCategory.API_ERROR;
  private static final String CODE = "20S0902";
  private static final String MESSAGE_KEY =
      "com.orb.framework.wallet.infrastructure.giftee.GifteeClient.UnknownError.message";

  /**
   * Creates an instance of <code>GifteeUnknownErrorException</code>.
   */
  public GifteeUnknownErrorException() {
    super(CATEGORY, CODE, MESSAGE_KEY);
  }

  /**
   * Creates an instance of <code>GifteeUnknownErrorException</code> with a specific cause.
   *
   * @param cause the cause of this exception.
   */
  public GifteeUnknownErrorException(Throwable cause) {
    super(CATEGORY, CODE, MESSAGE_KEY, cause);
  }
}
