package com.orb.framework.wallet.exception.user.cashpoint;

import com.orb.framework.wallet.exception.BusinessException;
import com.orb.framework.wallet.exception.ErrorCategory;

/**
 * Thrown when there is an attempt to create a session token using a onetime token that is not in
 * the repository.
 */
public class OnetimeTokenNotFoundException extends BusinessException {

  private static final ErrorCategory CATEGORY = ErrorCategory.INVALID_REQUEST_ERROR;
  private static final String CODE = "20B0307";
  private static final String MESSAGE_KEY =
      "com.orb.framework.wallet.model.user.cashpoint.OnetimeTokenNotFound.message";

  public OnetimeTokenNotFoundException() {
    super(CATEGORY, CODE, MESSAGE_KEY);
  }

  public OnetimeTokenNotFoundException(Throwable cause) {
    super(CATEGORY, CODE, MESSAGE_KEY, cause);
  }

}
