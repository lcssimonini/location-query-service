package com.simo.locationqueryservice.util;

import static org.apache.commons.lang3.StringUtils.stripAccents;

import lombok.experimental.UtilityClass;

@UtilityClass
public class StringUtil {

  public static String toLowerAndRemoveAccents(String inputString) {
    return stripAccents(inputString.toLowerCase());
  }
}
