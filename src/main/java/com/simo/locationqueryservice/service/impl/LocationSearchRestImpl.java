package com.simo.locationqueryservice.service.impl;

import static com.simo.locationqueryservice.util.StringUtil.toLowerAndRemoveAccents;

import com.simo.locationqueryservice.client.LocationClient;
import com.simo.locationqueryservice.domain.City;
import com.simo.locationqueryservice.service.LocationSearchService;
import java.util.List;
import java.util.stream.Collectors;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class LocationSearchRestImpl implements LocationSearchService {

  private final LocationClient locationClient;

  @Override
  public List<City> countryFilteredCities(String searchInput) {
    return locationClient.getCities().stream()
        .filter(
            city ->
                toLowerAndRemoveAccents(city.getName())
                    .contains(toLowerAndRemoveAccents(searchInput)))
        .collect(Collectors.toList());
  }

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
