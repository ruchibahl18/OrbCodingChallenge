package com.orb.framework.wallet.exception;

/**
 * Exception thrown when there is an error with the authentication configuration.
 */
public class AuthConfigException extends SystemException {

  private static final ErrorCategory CATEGORY = ErrorCategory.API_ERROR;
  private static final String CODE = "20S0912";
  private static final String MESSAGE_KEY =
      "com.orb.framework.auth.config.loader.AuthConfigProblem.message";

  /**
   * Creates an instance of <code>AuthConfigException</code>.
   */
  public AuthConfigException() {
    super(CATEGORY, CODE, MESSAGE_KEY);
  }

  /**
   * Creates an instance of <code>AuthConfigException</code> with a specific
   * cause.
   *
   * @param cause the cause of this exception.
   */
  public AuthConfigException(Throwable cause) {
    super(CATEGORY, CODE, MESSAGE_KEY, cause);
  }

}
