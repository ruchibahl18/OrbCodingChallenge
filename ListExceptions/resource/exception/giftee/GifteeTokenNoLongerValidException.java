package com.orb.framework.wallet.exception.giftee;

import com.orb.framework.wallet.exception.BusinessException;
import com.orb.framework.wallet.exception.ErrorCategory;

/**
 * Exception thrown when the giftee token passed by the user is either expired or has already been
 * used.
 */
public class GifteeTokenNoLongerValidException extends BusinessException {

  private static final ErrorCategory CATEGORY = ErrorCategory.INVALID_REQUEST_ERROR;
  private static final String CODE = "20B0909";
  private static final String MESSAGE_KEY =
      "com.orb.framework.wallet.infrastructure.giftee.GifteeClient.TokenNotValid.message";

  /**
   * Creates an instance of <code>GifteeTokenNoLongerValidException</code>.
   */
  public GifteeTokenNoLongerValidException() {
    super(CATEGORY, CODE, MESSAGE_KEY);
  }

  /**
   * Creates an instance of <code>GifteeTokenNoLongerValidException</code> with a specific cause.
   *
   * @param cause the cause of this exception.
   */
  public GifteeTokenNoLongerValidException(Throwable cause) {
    super(CATEGORY, CODE, MESSAGE_KEY, cause);
  }
}
