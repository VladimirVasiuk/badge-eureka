package com.galvanize.badgeeureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class BadgeEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(BadgeEurekaApplication.class, args);
    }
}
