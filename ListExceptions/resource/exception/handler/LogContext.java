package com.orb.framework.wallet.exception.handler;

/**
 * Format for the exception message when printing logs.
 */
class LogContext {

  private String code;
  private String message;
  private String status;

  LogContext(String code, String status, String message) {
    this.code = code;
    this.message = message;
    this.status = status;
  }

  @Override
  public String toString() {
    return "\"" + message + "\" code=" + code + " status=" + status;
  }
}
