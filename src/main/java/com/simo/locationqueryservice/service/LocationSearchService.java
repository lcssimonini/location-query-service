package com.simo.locationqueryservice.service;

import com.simo.locationqueryservice.domain.City;
import java.util.List;

public interface LocationSearchService {

  List<City> citiesByState(String stateInitials);

  List<City> allCities();
}
