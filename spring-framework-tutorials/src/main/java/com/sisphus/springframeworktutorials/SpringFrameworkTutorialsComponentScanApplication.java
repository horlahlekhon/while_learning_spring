
// package com.sisphus.springframeworktutorials;

// import org.slf4j.Logger;
// import org.slf4j.LoggerFactory;
// import org.springframework.boot.SpringApplication;
// import org.springframework.boot.autoconfigure.SpringBootApplication;
// import org.springframework.context.ApplicationContext;
// import com.sisphus.springframeworktutorials.basic.componentscan.*;

// @SpringBootApplication
// public class SpringFrameworkTutorialsComponentScanApplication {
    
//     private static Logger LOGGER =  LoggerFactory.getLogger(SpringFrameworkTutorialsComponentScanApplication.class);
//     public static void main(String[] args) {
//         ApplicationContext applicationContext = SpringApplication.run(SpringFrameworkTutorialsComponentScanApplication.class, args);

//         ComponentDAO componentDao = applicationContext.getBean(ComponentDAO.class);

//         ComponentDAO componentDao2 = applicationContext.getBean(ComponentDAO.class);

//         LOGGER.info("{}", componentDao);
//         LOGGER.info("{}", componentDao.getComponentJdbcConnection());

//         LOGGER.info("{}", componentDao2);
//         LOGGER.info("{}", componentDao2.getComponentJdbcConnection());

//     }

// }
