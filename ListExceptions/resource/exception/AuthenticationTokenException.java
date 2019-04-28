package com.orb.framework.wallet.exception;

/**
 * This exception is thrown when an authentication token is invalid. This may happen when:
 * <ul>
 * <li>no token record matching a passed string token was found</li>
 * <li>no user matching this token was found</li>
 * </ul>
 */
public class AuthenticationTokenException extends WalletAuthenticationException {

  private static final String CODE = "10B0600";
  private static final String MESSAGE_KEY
      = "com.orb.framework.wallet.security.AuthenticationFailure.message";

  public AuthenticationTokenException() {
    super(MESSAGE_KEY, CODE);
  }
}
