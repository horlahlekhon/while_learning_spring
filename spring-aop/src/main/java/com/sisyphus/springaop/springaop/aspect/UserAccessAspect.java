package com.sisyphus.springaop.springaop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

/**
 * BeforeAspect
 * AOP
 * Configurations
 */
@Configuration
@Aspect
public class UserAccessAspect {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    //we will need to define what we want todo when the method call that we want to intercept is interceptedt
    //what kind of method will we like to intercept
    //how does one intercept a method
    // the syntax for defining the method that we want to intercept is kinda weird
    // execution(* PACKAGE.*.*(...)) 
    //what this translates into is that the first "*" means that 'any return type' meaning that we want to intercept this method for any return type
    //"PACKAGE" means that in a specific package, this would be replaced by the package that we wanty to 'componentScan'
    //the zecond "*" means that in 'any class' as far as it is in that package 
    //the third "*" means that we want to intercept every method calls to this method,
    //the elipses (..) means that for any amount of args , or irrespective of arguments taken by the method.

    //this @Before annot. intercept method calls before they are invoked.
    //this is good when one want to check for authorization, so one can just check if the user has access to tyhe
    //method call before granting him an access to invoke it. the advantage of implementing user acces check
    //using AOP id that aop CHECKS span the entirety of the Business layer so we wont need to run the check again
    //whenever we want to grant access.
    @Before("execution(* com.sisyphus.springaop.springaop.data.*.*(..))")
    public void before(JoinPoint joinPoint) {
        logger.info("Check for user accesss");
        logger.info("Allow execution access for - {}", joinPoint);
    }
    
}