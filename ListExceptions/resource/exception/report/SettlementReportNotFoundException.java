package com.orb.framework.wallet.exception.report;

import com.orb.framework.wallet.exception.BusinessException;
import com.orb.framework.wallet.exception.ErrorCategory;

public class SettlementReportNotFoundException extends BusinessException {

  private static final ErrorCategory CATEGORY = ErrorCategory.INVALID_REQUEST_ERROR;
  private static final String CODE = "20B0291";
  private static final String MESSAGE_KEY =
      "com.orb.framework.wallet.model.report.SettlementReportNotFoundException.message";

  public SettlementReportNotFoundException() {
    super(CATEGORY, CODE, MESSAGE_KEY);
  }

  public SettlementReportNotFoundException(Throwable cause) {
    super(CATEGORY, CODE, MESSAGE_KEY, cause);
  }
}
