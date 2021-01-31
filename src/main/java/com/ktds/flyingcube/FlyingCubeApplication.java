package com.ktds.flyingcube;

import com.integralblue.log4jdbc.spring.Log4jdbcAutoConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(exclude = { Log4jdbcAutoConfiguration.class })
public class FlyingCubeApplication {

    public static void main(String[] args) {
        SpringApplication.run(FlyingCubeApplication.class, args);
    }

}
