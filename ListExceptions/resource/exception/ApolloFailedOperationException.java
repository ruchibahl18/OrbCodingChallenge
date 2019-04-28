package com.orb.framework.wallet.exception;

/**
 * Thrown when an Apollo operation (read/write) fails.
 */
public class ApolloFailedOperationException extends ApolloException {

  private final String operationName;

  /**
   * Creates a new instance of <code>ApolloFailedOperationException</code>.
   *
   * @param message A message describing the failure.
   * @param operationName The name of the operation that failed (e.g., "txWrite").
   */
  public ApolloFailedOperationException(String message, String operationName) {
    super(message);
    this.operationName = operationName;
  }

  @Override
  public String getMessage() {
    return String.format("Apollo operation (%s) failed: %s", operationName, super.getMessage());
  }
}
