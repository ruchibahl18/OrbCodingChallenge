package com.orb.framework.wallet.exception.merchant;

import com.orb.framework.wallet.exception.BusinessException;
import com.orb.framework.wallet.exception.ErrorCategory;
import org.springframework.http.HttpStatus;

/**
 * Exception thrown when attempting to fetch a unexisting shop record.
 */
public class ShopNotFoundException extends BusinessException {
  private static final ErrorCategory CATEGORY = ErrorCategory.INVALID_REQUEST_ERROR;
  private static final String CODE = "20B1015";
  private static final String MESSAGE_KEY = "com.orb.framework.wallet.model.shop.NotFound.message";

  /**
   * Creates a new instance of <code>ShopNotFoundException</code>.
   */
  public ShopNotFoundException() {
    super(CATEGORY, CODE, MESSAGE_KEY, HttpStatus.NOT_FOUND);
  }
}
