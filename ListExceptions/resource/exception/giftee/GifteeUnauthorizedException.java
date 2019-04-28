package com.orb.framework.wallet.exception.giftee;

import com.orb.framework.wallet.exception.ErrorCategory;
import com.orb.framework.wallet.exception.SystemException;

/**
 * Exception thrown when giftee returns an unauthorized status error.
 */
public class GifteeUnauthorizedException extends SystemException {

  private static final ErrorCategory CATEGORY = ErrorCategory.AUTHENTICATION_ERROR;
  private static final String CODE = "20S0908";
  private static final String MESSAGE_KEY =
      "com.orb.framework.wallet.infrastructure.giftee.GifteeClient.Unauthorized.message";

  /**
   * Creates an instance of <code>GifteeUnauthorizedException</code>.
   */
  public GifteeUnauthorizedException() {
    super(CATEGORY, CODE, MESSAGE_KEY);
  }

  /**
   * Creates an instance of <code>GifteeUnauthorizedException</code> with a specific cause.
   *
   * @param cause the cause of this exception.
   */
  public GifteeUnauthorizedException(Throwable cause) {
    super(CATEGORY, CODE, MESSAGE_KEY, cause);
  }
}
