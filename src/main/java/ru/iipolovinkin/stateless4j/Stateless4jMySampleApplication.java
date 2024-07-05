package ru.iipolovinkin.stateless4j;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class Stateless4jMySampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(Stateless4jMySampleApplication.class, args);
    }

}
