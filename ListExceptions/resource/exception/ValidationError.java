package com.orb.framework.wallet.exception;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by satoshi on 2018/01/11.
 */
@JsonIgnoreProperties({"field", "rejectedValue"})
public class ValidationError {

  @JsonProperty("category")
  public ErrorCategory category;

  @JsonProperty("code")
  public String code;

  @JsonProperty("detail")
  public String message;

  public String field;

  public Object rejectedValue;

  /**
   * Create a new <code>ValidationError</code> response object with the format:
   * - category, field, code, rejectedValue, message.
   *
   * @param category the category this error belongs to, taken from {@link ErrorCategory}.
   * @param field the name of the field where the error occurred.
   * @param code the unique code assigned to the exception that led to this particular error,
   *             @see <a href="https://docs.google.com/spreadsheets/d/1mQHYgGDbQXOBZ7XLg202tjE_E2VyPF-nmJPyiOCcWTo/edit#gid=1702670786">errors</a>
   * @param rejectedValue the value the user set which led to the error.
   * @param message the locale-resolved error message.
   */
  public ValidationError(ErrorCategory category, String field, String code, Object rejectedValue,
      String message) {
    this.category = category;
    this.code = code;
    this.message = message;
    this.field = field;
    this.rejectedValue = rejectedValue;
  }
}
