package com.simo.locationqueryservice.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class City {

  private String id;

  @JsonProperty("nome")
  private String name;
}
