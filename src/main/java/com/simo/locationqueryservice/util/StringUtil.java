package com.simo.locationqueryservice.util;

import lombok.experimental.UtilityClass;

import static org.apache.commons.lang3.StringUtils.stripAccents;

@UtilityClass
public class StringUtil {

  public static String toLowerAndRemoveAccents(String inputString) {
    return stripAccents(inputString.toLowerCase());
  }
}
