package com.bkty.springwebflux;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@Slf4j
@SpringBootApplication
public class SpringwebfluxDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringwebfluxDemoApplication.class, args);
        log.info("**********SpringWebfluxDemoApplication start success*******");
    }

}
