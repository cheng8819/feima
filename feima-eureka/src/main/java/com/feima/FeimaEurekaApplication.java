package com.feima;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class FeimaEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(FeimaEurekaApplication.class, args);
    }

}
