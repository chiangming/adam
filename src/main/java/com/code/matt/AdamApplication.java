package com.code.matt;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.code.matt.mapper")
public class AdamApplication {

    public static void main(String[] args) {
        SpringApplication.run(AdamApplication.class, args);
    }

}
