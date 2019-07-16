package com.feima;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.sleuth.zipkin.stream.EnableZipkinStreamServer;

@SpringBootApplication
@EnableZipkinStreamServer
public class FeimaZipkinApplication {

    public static void main(String[] args) {
        SpringApplication.run(FeimaZipkinApplication.class, args);
    }

}
