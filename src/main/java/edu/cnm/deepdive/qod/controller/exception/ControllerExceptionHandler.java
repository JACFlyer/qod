package edu.cnm.deepdive.qod.controller.exception;

import edu.cnm.deepdive.qod.controller.exception.SearchTemToShortException;
import java.util.NoSuchElementException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ControllerExceptionHandler {

@ExceptionHandler(SearchTemToShortException.class)
@ResponseStatus(value = HttpStatus.BAD_REQUEST, reason = "Search term too short")
public void tooShort() {}

  @ExceptionHandler(NoSuchElementException.class)
  @ResponseStatus(HttpStatus.NOT_FOUND)
  public void notFound() {}

  @ExceptionHandler(IllegalArgumentException.class)
  @ResponseStatus(HttpStatus.BAD_REQUEST)
  public void badRequest() {}

}