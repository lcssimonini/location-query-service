package com.simo.locationqueryservice.util;

import static com.simo.locationqueryservice.util.StringUtil.toLowerAndRemoveAccents;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class StringUtilTest {

  @Test
  void shouldReturnLowerCaseWithNoAccents() {
    String input01 = "AnInterestingStríng";

    assertEquals("aninterestingstring", toLowerAndRemoveAccents(input01));
  }
}
