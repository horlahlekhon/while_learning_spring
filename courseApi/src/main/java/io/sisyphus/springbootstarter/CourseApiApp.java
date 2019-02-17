package io.sisyphus.springbootstarter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CourseApiApp {

    
    public static void main(String[] args) {
        //make a call to the SpringApplication.run methods and pass our class as an argument to it
        SpringApplication.run(CourseApiApp.class, args);
    }
}