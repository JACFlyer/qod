package edu.cnm.deepdive.qod.controller.exception;

public class SearchTemToShortException extends IllegalArgumentException {

  public SearchTemToShortException() {
  }

  public SearchTemToShortException(String s) {
    super(s);
  }

  public SearchTemToShortException(String message, Throwable cause) {
    super(message, cause);
  }

  public SearchTemToShortException(Throwable cause) {
    super(cause);
  }
}
