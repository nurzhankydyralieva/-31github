package org.project_1.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("org.project_1")
@PropertySource("classpath:application.properties")
public class AppConfig {

}
