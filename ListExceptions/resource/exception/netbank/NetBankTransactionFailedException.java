package com.orb.framework.wallet.exception.netbank;

import com.orb.framework.wallet.exception.BusinessException;
import com.orb.framework.wallet.exception.ErrorCategory;

/**
 * Exception thrown when there is some problem with the transaction using the netbank API.
 */
public class NetBankTransactionFailedException extends BusinessException {
  private static final ErrorCategory CATEGORY = ErrorCategory.INVALID_REQUEST_ERROR;
  private static final String CODE = "20B0210";
  private static final String MESSAGE_KEY =
      "com.orb.framework.wallet.infrastructure.netbank.TransactionFailed.message";

  /**
   * Creates an instance of <code>NetBankTransactionFailedException</code>.
   */
  public NetBankTransactionFailedException() {
    super(CATEGORY, CODE, MESSAGE_KEY);
  }

}
