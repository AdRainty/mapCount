package com.adrainty.mapcount;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class MapCountApplication {

    public static void main(String[] args) {
        SpringApplication.run(MapCountApplication.class, args);
    }

}
