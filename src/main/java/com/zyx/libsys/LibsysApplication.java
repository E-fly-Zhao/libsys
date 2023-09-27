package com.zyx.libsys;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
public class LibsysApplication {

    public static void main(String[] args) {
        SpringApplication.run(LibsysApplication.class, args);
    }

}
