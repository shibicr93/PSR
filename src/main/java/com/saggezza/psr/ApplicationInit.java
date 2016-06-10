package com.saggezza.psr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by shibi on 9/6/16.
 */
@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan
public class ApplicationInit {

    public static void main(String[] args) {
        SpringApplication.run(ApplicationInit.class, args);
    }
}
