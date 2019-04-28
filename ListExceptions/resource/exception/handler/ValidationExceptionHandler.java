package com.orb.framework.wallet.exception.handler;

import com.orb.framework.wallet.RequestInterceptor;
import com.orb.framework.wallet.exception.ErrorCategory;
import com.orb.framework.wallet.exception.ErrorResponse;
import com.orb.framework.wallet.exception.ValidationError;
import java.util.List;
import java.util.stream.Collectors;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

/**
 * Created by satoshi on 2018/01/11.
 */
@ControllerAdvice
@Order(Ordered.HIGHEST_PRECEDENCE)
public class ValidationExceptionHandler extends ResponseEntityExceptionHandler {

  private static final Logger LOGGER = LoggerFactory.getLogger(ValidationExceptionHandler.class);

  private static final String VALIDATION_ERROR_MESSAGE_KEY =
        "javax.validation.constraints.error.message";

  @Override
  protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex,
      HttpHeaders headers, HttpStatus status, WebRequest request) {
    RequestInterceptor.setRequestLatency();
    LOGGER.warn(
        new LogContext(
            Integer.toString(HttpStatus.BAD_REQUEST.value()),
            status.toString(),
            "Invalid request parameters").toString(),
        ex);
    BindingResult bindingResult = ex.getBindingResult();

    List<ValidationError> fieldErrors = bindingResult.getFieldErrors().stream()
        .map(fe -> new ValidationError(
            ErrorCategory.INVALID_REQUEST_ERROR,
            fe.getField(),
            fe.getCode(),
            fe.getRejectedValue(),
            fe.getDefaultMessage()
        )).collect(Collectors.toList());

    ErrorResponse errors = new ErrorResponse<>(fieldErrors);
    return new ResponseEntity<>(errors, HttpStatus.BAD_REQUEST);
  }

}
