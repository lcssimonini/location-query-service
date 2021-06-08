package com.simo.locationqueryservice.exception;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RemoteCallException extends RuntimeException {

  private Integer status;
  private String message;
}
