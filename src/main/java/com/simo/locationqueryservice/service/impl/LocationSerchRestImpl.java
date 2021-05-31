package com.simo.locationqueryservice.service.impl;

import com.simo.locationqueryservice.client.LocationClient;
import com.simo.locationqueryservice.domain.City;
import com.simo.locationqueryservice.service.LocationSearchService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class LocationSerchRestImpl implements LocationSearchService {

  private final LocationClient locationClient;

  @Override
  public List<City> citiesByState(String stateInitials) {
    log.info("Searching for cities of state with initials {}", stateInitials);
    return locationClient.getCitiesByState(stateInitials);
  }

  @Override
  public List<City> allCities() {
    log.info("Searching for all city data");
    return locationClient.getCities();
  }
}
