package com.simo.locationqueryservice.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

  @ExceptionHandler(RemoteCallException.class)
  public ResponseEntity<RemoteCallException> shouldGetRemoteException(
      RemoteCallException exception) {
    return ResponseEntity.status(exception.getStatus()).body(exception);
  }
}
