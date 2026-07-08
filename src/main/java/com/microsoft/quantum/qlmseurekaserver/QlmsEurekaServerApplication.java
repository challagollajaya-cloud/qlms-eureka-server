package com.microsoft.quantum.qlmseurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class QlmsEurekaServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(QlmsEurekaServerApplication.class, args);
    }
}
