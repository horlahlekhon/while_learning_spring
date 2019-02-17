package com.sisphus.springframeworktutorials.basic;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//Component annotation is used to annotate Bean classes which implement dependency injection
@Component
class BinarySearchImpl{

    private Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    //this annotation is used to annotate a dependency. SortAlgorith is A dependency of the main class here
    //BinarySearchImpl
    @Autowired
    private SortAlgorithm sortAlgorithm;

    public int binarySearch(int[] data , int numberToSearchFor) {


        int[] sortedNumber = sortAlgorithm.sort(data);
        System.out.println(sortedNumber);

        //search the array
        return 3;
        
    }
    // lets assume we want to do something before a bean is destroyed , like check
    // if all its dependencies are populated , we can use the @PostConstruct,
    // annotation on a method that will perform the action and as soon as the this bean is created 
    // the method will be called.
    @PostConstruct
    public void postConstruct(){
        LOGGER.info("post construct");

    }

    @PreDestroy
    public void preDestroy(){
        LOGGER.info("Pre destroy");
    }

}