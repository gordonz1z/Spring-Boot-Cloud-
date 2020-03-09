package com.bookfun.demoeurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Registration Control
 * https://spring.io/guides/gs/service-registration-and-discovery/
 *  * 1. Config Eureka Info
 *  * 2. @EnableEurekaServer
 */
@SpringBootApplication
@EnableEurekaServer
public class DemoEurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoEurekaServerApplication.class, args);
    }

}
