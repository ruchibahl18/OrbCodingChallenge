package com.orb.framework.wallet.exception;

import com.orb.apollo.thrift.TransactionStatus;

/**
 * Thrown when an attempted transaction recovery fails.
 */
public class TransactionRecoveryFailedException extends ApolloException {

  private final TransactionStatus status;

  /**
   * Constructs a new instance of <code>TransactionRecoveryFailedException</code>.
   *
   * @param recoveryStatus The status returned by the Apollo client <code>txRecover</code> method.
   */
  public TransactionRecoveryFailedException(TransactionStatus recoveryStatus) {
    super("transaction recovery failed with status '%s'");
    status = recoveryStatus;
  }

  @Override
  public String getMessage() {
    return String.format(super.getMessage(), status.toString());
  }
}
