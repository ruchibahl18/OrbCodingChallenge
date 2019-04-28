package com.orb.framework.wallet.exception;

/**
 * This exception is thrown when a user with a disabled account attempts to log in the system.
 */
public class DisabledAccountException extends WalletAuthenticationException {

  private static final String CODE = "10B0602";
  private static final String MESSAGE_KEY =
      "com.orb.framework.wallet.login.DisabledAccount.message";

  public DisabledAccountException() {
    super(MESSAGE_KEY, CODE);
  }
}
