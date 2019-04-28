package com.orb.framework.wallet.exception.giftee;

import com.orb.framework.wallet.exception.BusinessException;
import com.orb.framework.wallet.exception.ErrorCategory;

/**
 * Exception thrown when the giftee payment API returns a NOT FOUND status error.
 */
public class GifteeTokenNotFoundException extends BusinessException {

  private static final ErrorCategory CATEGORY = ErrorCategory.INVALID_REQUEST_ERROR;
  private static final String CODE = "20B0901";
  private static final String MESSAGE_KEY =
      "com.orb.framework.wallet.infrastructure.giftee.GifteeClient.TokenNotFound.message";

  /**
   * Creates an instance of <code>GifteeTokenNotFoundException</code>.
   */
  public GifteeTokenNotFoundException() {
    super(CATEGORY, CODE, MESSAGE_KEY);
  }

  /**
   * Creates an instance of <code>GifteeTokenNotFoundException</code> with a specific cause.
   *
   * @param cause the cause of this exception.
   */
  public GifteeTokenNotFoundException(Throwable cause) {
    super(CATEGORY, CODE, MESSAGE_KEY, cause);
  }

}
