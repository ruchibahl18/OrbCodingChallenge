package com.orb.framework.wallet.exception;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by satoshi on 2018/01/17.
 */
public class ApiError {

  @JsonProperty("category")
  public ErrorCategory category;

  @JsonProperty("code")
  public String code;

  @JsonProperty("detail")
  public String message;

  /**
   * Create a new <code>ApiError</code> response object with the format:
   * - category, code, message.
   *
   * @param category the category this error belongs to, taken from {@link ErrorCategory}.
   * @param code the unique code assigned to the exception that led to this particular error,
   *             @see <a href="https://docs.google.com/spreadsheets/d/1mQHYgGDbQXOBZ7XLg202tjE_E2VyPF-nmJPyiOCcWTo/edit#gid=1702670786">errors</a>
   * @param message the locale-resolved error message.
   */
  public ApiError(ErrorCategory category, String code, String message) {
    this.category = category;
    this.code = code;
    this.message = message;
  }
}
