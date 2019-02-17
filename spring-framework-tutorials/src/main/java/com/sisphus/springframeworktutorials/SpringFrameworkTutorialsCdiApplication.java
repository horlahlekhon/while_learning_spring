
package com.sisphus.springframeworktutorials;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
// import org.springframework.boot.SpringApplication;
// import org.springframework.boot.autoconfigure.SpringBootApplication;
// import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.sisphus.springframeworktutorials.cdi.*;

@Configuration
@ComponentScan("com.sisphus.springframeworktutorials")
public class SpringFrameworkTutorialsCdiApplication {

    private static Logger LOGGER = LoggerFactory.getLogger(SpringFrameworkTutorialsCdiApplication.class);

    public static void main(String[] args) {
        try (AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(
                SpringFrameworkTutorialsCdiApplication.class)) {
            SomeCDIBusiness someCdiBusiness = applicationContext.getBean(SomeCDIBusiness.class);

            LOGGER.info("{}", someCdiBusiness);
        }

    }

}
