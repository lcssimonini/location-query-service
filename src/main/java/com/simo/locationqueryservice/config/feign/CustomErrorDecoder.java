package com.simo.locationqueryservice.config.feign;

import com.simo.locationqueryservice.exception.RemoteCallException;
import feign.Response;
import feign.codec.ErrorDecoder;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;

@Slf4j
@Configuration
public class CustomErrorDecoder implements ErrorDecoder {

  @Override
  public Exception decode(String methodKey, Response response) {
    log.info(response.toString());
    return RemoteCallException.builder()
        .status(response.status())
        .message(response.reason())
        .build();
  }
}
