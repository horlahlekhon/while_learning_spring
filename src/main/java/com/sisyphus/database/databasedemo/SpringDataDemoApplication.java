package com.sisyphus.database.databasedemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

import com.sisyphus.database.databasedemo.entity.Person;
import com.sisyphus.database.databasedemo.springdata.PersonSpringDataJpaRepository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

@SpringBootApplication
public class SpringDataDemoApplication implements CommandLineRunner {

    private Logger logger = LoggerFactory.getLogger(SpringDataDemoApplication.class);

    @Autowired
    PersonSpringDataJpaRepository personSpringDataJpaRepository;

    public static void main(String[] args) {
        SpringApplication.run(SpringDataDemoApplication.class, args);
    }

    // CommandLineRunner is an interfsce in spring boot and it is used to execute a
    // code as soon as the
    // spring execution context is ready, so any code inserted into the lone method
    // inside this interface will be run
    // the Application COntext is loaded.
    @Override
    public void run(String... args) throws Exception {

        logger.info("User 1001 --> {}", personSpringDataJpaRepository.findById(1001));
        // logger.info("deleted 1001 --> {}", personJpaRepository.deleteById(1002));
        logger.info("inserting 1004 --> {}",
                personSpringDataJpaRepository.save(new Person("Niola", "Germany", new Date(1999, 4, 3))));
        logger.info("updating 1001 --> {}",
                personSpringDataJpaRepository.save(new Person(100, "Niola", "Utretch", new Date(1999, 4, 3))));
        logger.info("all users --> {}", personSpringDataJpaRepository.findAll());
    }

}
