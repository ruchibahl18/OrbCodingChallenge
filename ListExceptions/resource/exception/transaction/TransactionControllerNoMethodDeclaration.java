package com.orb.framework.wallet.exception.transaction;

import com.orb.framework.wallet.exception.ErrorCategory;
import com.orb.framework.wallet.exception.SystemException;

/**
 * Exception thrown when a controller does not implement some method declared in the config file.
 */
public class TransactionControllerNoMethodDeclaration extends SystemException {

  private static final ErrorCategory CATEGORY = ErrorCategory.API_ERROR;
  private static final String CODE = "20S0917";
  private static final String MESSAGE_KEY =
      "com.orb.framework.wallet.config.transaction"
          + ".TransactionControllerNoMethodDeclaration.message";

  /**
   * Creates an instance of <code>TransactionControllerNoMethodDeclaration</code>.
   */
  public TransactionControllerNoMethodDeclaration() {
    super(CATEGORY, CODE, MESSAGE_KEY);
  }
}
