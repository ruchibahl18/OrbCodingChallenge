package com.orb.framework.wallet.exception.transaction;

import com.orb.framework.wallet.exception.BusinessException;
import com.orb.framework.wallet.exception.ErrorCategory;

public class InvalidTransactionParticipantException extends BusinessException {

  private static final ErrorCategory CATEGORY = ErrorCategory.INVALID_REQUEST_ERROR;
  private static final String CODE = "20B0199";
  private static final String MESSAGE_KEY =
      "com.orb.framework.wallet.transaction.BaseTransactionStrategy.InvalidParticipant.message";

  public InvalidTransactionParticipantException() {
    super(CATEGORY, CODE, MESSAGE_KEY);
  }

  public InvalidTransactionParticipantException(Throwable cause) {
    super(CATEGORY, CODE, MESSAGE_KEY, cause);
  }

}
