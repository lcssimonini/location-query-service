package com.simo.locationqueryservice.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class PostalCodeData {

  @JsonProperty("cep")
  private String postalCode;

  @JsonProperty("logradouro")
  private String address;

  @JsonProperty("complemento")
  private String complement;

  @JsonProperty("bairro")
  private String district;

  @JsonProperty("localidade")
  private String city;

  @JsonProperty("ddd")
  private String areaCode;
}
