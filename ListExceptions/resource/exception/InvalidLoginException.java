package com.orb.framework.wallet.exception;

/**
 * This exception is thrown when a login attempt failed.
 */
public class InvalidLoginException extends WalletAuthenticationException {

  private static final String CODE = "10B0601";
  private static final String MESSAGE_KEY = "com.orb.framework.wallet.login.LoginFailure.message";

  public InvalidLoginException() {
    super(MESSAGE_KEY, CODE);
  }
}
