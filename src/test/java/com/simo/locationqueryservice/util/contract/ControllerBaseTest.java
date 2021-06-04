package com.simo.locationqueryservice.util.contract;

import com.simo.locationqueryservice.LocationQueryServiceApplication;
import io.restassured.module.mockmvc.RestAssuredMockMvc;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.web.context.WebApplicationContext;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@ExtendWith(SpringExtension.class)
@SpringBootTest(classes = LocationQueryServiceApplication.class)
public class ControllerBaseTest {

  @Autowired private WebApplicationContext webApplicationContext;

  @BeforeAll
  public void initialiseRestAssuredMockMvcWebApplicationContext() {
    RestAssuredMockMvc.webAppContextSetup(webApplicationContext);
  }
}
