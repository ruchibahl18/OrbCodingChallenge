package com.orb.framework.wallet.exception.oauth;

import com.orb.framework.wallet.exception.BusinessException;
import com.orb.framework.wallet.exception.ErrorCategory;

/**
 * Exception thrown when there is no valid access token for the requesting user.
 */
public class NoAccessTokenAvailableException extends BusinessException {

  private static final ErrorCategory CATEGORY = ErrorCategory.AUTHENTICATION_ERROR;
  private static final String CODE = "20S1000";
  private static final String MESSAGE_KEY =
      "com.orb.framework.wallet.model.auth.oauth.NoAccessToken.message";

  /**
   * Creates an instance of <code>NoAccessTokenAvailableException</code>.
   */
  public NoAccessTokenAvailableException() {
    super(CATEGORY, CODE, MESSAGE_KEY);
  }
}
