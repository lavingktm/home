package com.ioc.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan (value = {"com.ioc.service","com.ioc.controller"})
public class AppConfig {

}
