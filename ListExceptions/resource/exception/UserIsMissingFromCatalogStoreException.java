package com.orb.framework.wallet.exception;

public class UserIsMissingFromCatalogStoreException extends SystemException {

  private static final ErrorCategory CATEGORY = ErrorCategory.TRANSACTION_ERROR;
  private static final String CODE = "10S0701";
  private static final String MESSAGE_KEY =
      "com.orb.framework.wallet.model.history.list.MerchantListService.UserNotFound.message";

  public UserIsMissingFromCatalogStoreException() {
    super(CATEGORY, CODE, MESSAGE_KEY);
  }

  public UserIsMissingFromCatalogStoreException(Throwable cause) {
    super(CATEGORY, CODE, MESSAGE_KEY, cause);
  }

}
