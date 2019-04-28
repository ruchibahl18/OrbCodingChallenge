package com.orb.framework.wallet.exception.history.merchant;

import com.orb.framework.wallet.exception.BusinessException;
import com.orb.framework.wallet.exception.ErrorCategory;

/**
 * Exception thrown when a merchant history query contains an invalid time parameter. This may
 * involve:
 * <ul>
 * <li>year<0</li>
 * <li>month<1 or month>12</li>
 * <li>day incompatible with month and year</li>
 * <li>year or month null while either year, month or day is not null</li>
 * </ul>
 */
public class InvalidTimeParameterException extends BusinessException {

  private static final ErrorCategory CATEGORY = ErrorCategory.INVALID_REQUEST_ERROR;
  private static final String CODE = "20B0404";
  private static final String MESSAGE_KEY =
      "com.orb.framework.wallet.model.history.merchant.TimeParameter.message";

  /**
   * Creates an instance of <code>InvalidTimeParameterException</code>.
   */
  public InvalidTimeParameterException() {
    super(CATEGORY, CODE, MESSAGE_KEY);
  }
}
