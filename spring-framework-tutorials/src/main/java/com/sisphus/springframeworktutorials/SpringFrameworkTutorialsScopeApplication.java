// package com.sisphus.springframeworktutorials;

// import org.slf4j.Logger;
// import org.slf4j.LoggerFactory;
// import org.springframework.boot.SpringApplication;
// import org.springframework.boot.autoconfigure.SpringBootApplication;
// import org.springframework.context.ApplicationContext;
// import com.sisphus.springframeworktutorials.scope.PersonDAO;

// @SpringBootApplication
// public class SpringFrameworkTutorialsScopeApplication {
    
//     private static Logger LOGGER =  LoggerFactory.getLogger(SpringFrameworkTutorialsScopeApplication.class);
//     public static void main(String[] args) {
//         ApplicationContext applicationContext = SpringApplication.run(SpringFrameworkTutorialsScopeApplication.class, args);

//         PersonDAO personDao = applicationContext.getBean(PersonDAO.class);

//         PersonDAO personDao2 = applicationContext.getBean(PersonDAO.class);

//         LOGGER.info("{}", personDao);
//         LOGGER.info("{}", personDao.getJdbcConnection());

//         LOGGER.info("{}", personDao2);
//         LOGGER.info("{}", personDao2.getJdbcConnection());

//     }

// }
