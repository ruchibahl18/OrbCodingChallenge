package com.orb.framework.wallet.exception;

import java.util.List;

/**
 * Created by satoshi on 2018/01/11.
 */
public class ErrorResponse<T> {

  public List<T> errors;

  public ErrorResponse(List<T> fieldErrors) {
    this.errors = fieldErrors;
  }
}
