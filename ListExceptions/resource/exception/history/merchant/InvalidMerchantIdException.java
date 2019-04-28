package com.orb.framework.wallet.exception.history.merchant;

import com.orb.framework.wallet.exception.BusinessException;
import com.orb.framework.wallet.exception.ErrorCategory;

/**
 * Exception thrown when a user requests to see an unauthorized or unavailable merchant's tx
 * history.
 */
public class InvalidMerchantIdException extends BusinessException {

  private static final ErrorCategory CATEGORY = ErrorCategory.INVALID_REQUEST_ERROR;
  private static final String CODE = "20B0402";
  private static final String MESSAGE_KEY =
      "com.orb.framework.wallet.application.history.merchant.MerchantHistoryController"
          + ".InvalidMerchantId.message";

  /**
   * Creates an instance of <code>InvalidMerchantIdException</code>.
   */
  public InvalidMerchantIdException() {
    super(CATEGORY, CODE, MESSAGE_KEY);
  }

  /**
   * Creates an instance of <code>InvalidMerchantIdException</code> with a specific cause.
   *
   * @param cause the cause of this exception.
   */
  public InvalidMerchantIdException(Throwable cause) {
    super(CATEGORY, CODE, MESSAGE_KEY, cause);
  }
}
