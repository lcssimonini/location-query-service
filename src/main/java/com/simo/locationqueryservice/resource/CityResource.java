package com.simo.locationqueryservice.resource;

import com.simo.locationqueryservice.domain.City;
import com.simo.locationqueryservice.service.LocationSearchService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/cities")
@RequiredArgsConstructor
public class CityResource {

  private final LocationSearchService locationSearchService;

  @GetMapping("/{stateInitials}")
  public List<City> citiesByState(@PathVariable("stateInitials") String stateInitials) {
    return locationSearchService.citiesByState(stateInitials);
  }
}
