package com.xuanzhe.springbootproj.config;

import java.util.Locale;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.LocaleResolver;
import org.thymeleaf.util.StringUtils;

public class MyLocaleResolver implements LocaleResolver {

  @Override
  public Locale resolveLocale(HttpServletRequest request) {
    String language = request.getParameter("l");
    Locale locale = Locale.getDefault();
    if(!StringUtils.isEmpty(language)){
      String[] split = language.split("_");
      locale = new Locale(split[0], split[1]);
    }
    return locale;
  }

  @Override
  public void setLocale(HttpServletRequest httpServletRequest,
      HttpServletResponse httpServletResponse, Locale locale) {

  }
}
