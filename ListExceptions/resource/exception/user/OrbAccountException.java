package com.orb.framework.wallet.exception.user;

import com.orb.framework.wallet.exception.ErrorCategory;
import com.orb.framework.wallet.exception.SystemException;

/**
 * Exception thrown when creating an orb account failed.
 */
public class OrbAccountException extends SystemException {

  private static final ErrorCategory CATEGORY = ErrorCategory.API_ERROR;
  private static final String CODE = "20S1002";
  private static final String MESSAGE_KEY =
      "com.orb.framework.wallet.model.user.CreateOrbAccount.Failure.message";

  /**
   * Creates an instance of <code>OrbAccountException</code>.
   *
   * @param e The cause of this exception.
   */
  public OrbAccountException(Throwable e) {
    super(CATEGORY, CODE, MESSAGE_KEY, e);
  }
}
