package com.orb.framework.wallet.exception;

/**
 * Created by satoshi on 2018/01/23.
 */
public class IllegalVerificationCodeException extends BusinessException {

  public IllegalVerificationCodeException(ErrorCategory category, String code, String messageKey) {
    this(category, code, messageKey, null);
  }

  public IllegalVerificationCodeException(
      ErrorCategory category,
      String code,
      String messageKey,
      Throwable cause) {
    super(category, code, messageKey, cause);
  }

}
