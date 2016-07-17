package com.kbhit.orangebox.service.locator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ServiceLocatorApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceLocatorApplication.class, args);
    }

}
