package com.orb.framework.wallet.exception.giftee;

import com.orb.framework.wallet.exception.ErrorCategory;
import com.orb.framework.wallet.exception.SystemException;

/**
 * Exception thrown when the giftee API returns a 500 status error.
 */
public class GifteeSystemErrorException extends SystemException {

  private static final ErrorCategory CATEGORY = ErrorCategory.API_ERROR;
  private static final String CODE = "20S0907";
  private static final String MESSAGE_KEY =
      "com.orb.framework.wallet.infrastructure.giftee.GifteeClient.SystemError.message";

  /**
   * Creates an instance of <code>GifteeSystemErrorException</code>.
   */
  public GifteeSystemErrorException() {
    super(CATEGORY, CODE, MESSAGE_KEY);
  }

  /**
   * Creates an instance of <code>GifteeSystemErrorException</code> with a specific cause.
   *
   * @param cause the cause of this exception.
   */
  public GifteeSystemErrorException(Throwable cause) {
    super(CATEGORY, CODE, MESSAGE_KEY, cause);
  }
}
