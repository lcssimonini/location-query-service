package com.simo.locationqueryservice.client;

import com.simo.locationqueryservice.domain.City;
import java.util.List;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "LocationClient", url = "${location-service.url}")
public interface LocationClient {

  @GetMapping("/localidades/municipios")
  List<City> getCities();

  @GetMapping("/localidades/estados/{stateInitials}/municipios")
  List<City> getCitiesByState(@PathVariable("stateInitials") String stateInitials);
}
