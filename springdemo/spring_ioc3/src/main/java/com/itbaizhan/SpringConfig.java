package com.itbaizhan;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.itbaizhan")
@PropertySource("classpath:db.properties")
@Import(ServiceConfig.class)
public class SpringConfig {

}
