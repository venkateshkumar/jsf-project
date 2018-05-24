package com.akms.app.view;

import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Navigation from login page
 * @author Sai
 *
 */
@Configuration
public class NavigationView extends WebMvcConfigurerAdapter {

  @Override
  public void addViewControllers(ViewControllerRegistry registry) {
    registry.addViewController("/")
        .setViewName("forward:/employee.xhtml");
    registry.setOrder(Ordered.HIGHEST_PRECEDENCE);

    super.addViewControllers(registry);
  }
}