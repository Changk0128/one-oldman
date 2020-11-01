package com.jk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class OneProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(OneProviderApplication.class, args);
    }

}
