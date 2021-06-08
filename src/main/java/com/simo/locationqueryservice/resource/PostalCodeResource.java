package com.simo.locationqueryservice.resource;

import com.simo.locationqueryservice.domain.PostalCodeData;
import com.simo.locationqueryservice.service.PostalCodeService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/postal-codes")
@RequiredArgsConstructor
public class PostalCodeResource {

  private final PostalCodeService postalCodeService;

  @GetMapping("/{postalCodeNumber}")
  PostalCodeData getPostalCodeData(@PathVariable("postalCodeNumber") String postalCodeNumber) {
    log.info("Fetching information for postal code number {}", postalCodeNumber);
    return postalCodeService.getPostalCodeData(postalCodeNumber);
  }
}
