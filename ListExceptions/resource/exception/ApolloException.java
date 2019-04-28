package com.orb.framework.wallet.exception;

import org.springframework.dao.DataAccessException;

/**
 * Thrown when an error occurs while accessing Apollo.
 */
public class ApolloException extends DataAccessException {

  /**
   * Creates a new instance of <code>ApolloException</code>.
   *
   * @param message A message describing the error.
   */
  public ApolloException(String message) {
    super(message);
  }

  /**
   * Creates a new instance of <code>ApolloException</code>.
   *
   * @param message A message describing the error.
   * @param cause The cause of the error.
   */
  public ApolloException(String message, Throwable cause) {
    super(message, cause);
  }
}
