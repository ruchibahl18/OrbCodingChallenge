package com.orb.framework.wallet.exception;

/**
 * Thrown when an entity type cannot be used with the repository.
 *
 * <p>Typically, this will be thrown when attempting to instantiate an instance of the
 * entity class. Likely causes are missing default constructor or incorrect method visibility.</p>
 */
public class IncompatibleEntityTypeException extends ApolloException {

  /**
   * Constructs a new instance of <code>IncompatibleEntityTypeException</code>.
   *
   * @param message A description of the error.
   * @param cause The cause of the error.
   */
  public IncompatibleEntityTypeException(String message, Throwable cause) {
    super(message, cause);
  }
}
