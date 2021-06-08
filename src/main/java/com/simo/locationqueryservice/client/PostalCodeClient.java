package com.simo.locationqueryservice.client;

import com.simo.locationqueryservice.domain.PostalCodeData;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "PostalCodesClient", url = "${postal-code-service.url}")
public interface PostalCodeClient {

  @GetMapping("{postalCode}/json")
  PostalCodeData getPostalCodeData(@PathVariable("postalCode") String postalCode);
}
