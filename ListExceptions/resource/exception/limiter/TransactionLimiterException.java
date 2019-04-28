package com.orb.framework.wallet.exception.limiter;

import com.orb.framework.wallet.exception.BusinessException;
import com.orb.framework.wallet.exception.ErrorCategory;
import com.orb.framework.wallet.model.transaction.Validator;

/**
 * Exception thrown when a Transaction will produce results that bypass some limit set by a
 * {@link Validator}.
 */
public abstract class TransactionLimiterException extends BusinessException {

  /**
   * Creates an instance of <code>TransactionLimiterException</code>.
   */
  public TransactionLimiterException(ErrorCategory category, String code, String messageKey) {
    super(category, code, messageKey);
  }

}
