package com.orb.framework.wallet.exception.proxy;

import com.orb.framework.wallet.exception.BusinessException;
import com.orb.framework.wallet.exception.ErrorCategory;

//Thrown when a proxy is requested and one of the users does not have the correct authority.
public class UnauthorizedProxyOperationException extends BusinessException {

  private static final ErrorCategory CATEGORY = ErrorCategory.INVALID_REQUEST_ERROR;
  private static final String CODE = "20B0308";
  private static final String MESSAGE_KEY =
      "com.orb.framework.wallet.model.proxy.UnauthorizedProxy.message";

  public UnauthorizedProxyOperationException() {
    super(CATEGORY, CODE, MESSAGE_KEY);
  }

  public UnauthorizedProxyOperationException(Throwable cause) {
    super(CATEGORY, CODE, MESSAGE_KEY, cause);
  }
}
