package com.orb.framework.wallet.exception.merchant;

import com.orb.framework.wallet.exception.BusinessException;
import com.orb.framework.wallet.exception.ErrorCategory;
import org.springframework.http.HttpStatus;

/**
 * Exception thrown when attempting to fetch a unexisting merchant record.
 */
public class MerchantNotFoundException extends BusinessException {
  private static final ErrorCategory CATEGORY = ErrorCategory.INVALID_REQUEST_ERROR;
  private static final String CODE = "20B1009";
  private static final String MESSAGE_KEY = "com.orb.framework.wallet"
      + ".model.merchant.NotFound.message";

  /**
   * Creates a new instance of <code>MerchantNotFoundException</code>.
   */
  public MerchantNotFoundException() {
    super(CATEGORY, CODE, MESSAGE_KEY, HttpStatus.NOT_FOUND);
  }
}
