package com.simo.locationqueryservice.service;

import com.simo.locationqueryservice.domain.PostalCodeData;

public interface PostalCodeService {

  PostalCodeData getPostalCodeData(String postalCodeNumber);
}
