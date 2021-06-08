package com.simo.locationqueryservice.resource;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

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

  @GetMapping(value = "/{stateInitials}", produces = APPLICATION_JSON_VALUE)
  public List<City> citiesByState(@PathVariable("stateInitials") String stateInitials) {
    //    return Collections.singletonList(City.builder().id("5300108").name("Brasília").build());
    return locationSearchService.citiesByState(stateInitials);
  }
}
