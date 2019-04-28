package com.orb.framework.wallet.exception;

public class InvalidAuthorityException extends BusinessException {

  private static final ErrorCategory CATEGORY = ErrorCategory.INVALID_REQUEST_ERROR;
  private static final String CODE = "10B0700";
  private static final String MESSAGE_KEY =
      "com.orb.framework.wallet.model.history.list.MerchantListService"
          + ".NoUserWithThatAuthorizationExists.message";

  public InvalidAuthorityException() {
    super(CATEGORY, CODE, MESSAGE_KEY);
  }

  public InvalidAuthorityException(Throwable cause) {
    super(CATEGORY, CODE, MESSAGE_KEY, cause);
  }
}
