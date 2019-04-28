package com.orb.framework.wallet.exception.history.merchant;

import com.orb.framework.wallet.exception.BusinessException;
import com.orb.framework.wallet.exception.ErrorCategory;

/**
 * Exception thrown when the time zone submitted with a merchant history request does not have an
 * offset format. An valid offset format has the structure +/-"hours":"minutes". Example: +09:00.
 */
public class InvalidOffsetFormatException extends BusinessException {

  private static final ErrorCategory CATEGORY = ErrorCategory.INVALID_REQUEST_ERROR;
  private static final String CODE = "20B0401";
  private static final String MESSAGE_KEY =
      "com.orb.framework.wallet.application.history.TxHistoryController"
          + ".InvalidOffsetFormat.message";

  /**
   * Creates an instance of <code>InvalidOffsetFormatException</code>.
   */
  public InvalidOffsetFormatException() {
    super(CATEGORY, CODE, MESSAGE_KEY);
  }

  /**
   * Creates an instance of <code>InvalidOffsetFormatException</code> with a specific cause.
   *
   * @param cause The cause of this exception.
   */
  public InvalidOffsetFormatException(Throwable cause) {
    super(CATEGORY, CODE, MESSAGE_KEY, cause);
  }

}
