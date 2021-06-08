package com.simo.locationqueryservice.service.impl;

import com.simo.locationqueryservice.client.PostalCodeClient;
import com.simo.locationqueryservice.domain.PostalCodeData;
import com.simo.locationqueryservice.service.PostalCodeService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class PostalCodeServiceImpl implements PostalCodeService {

  private final PostalCodeClient postalCodeClient;

  @Override
  public PostalCodeData getPostalCodeData(String postalCodeNumber) {
    return postalCodeClient.getPostalCodeData(postalCodeNumber);
  }
}
