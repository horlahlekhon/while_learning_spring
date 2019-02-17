package com.sisyphus.springaop.springaop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class AfterAopAspect {

    private Logger logger = LoggerFactory.getLogger(this.getClass());


    //this advice is used to intercept methods after they have returned 
    //it takes a variable to which to store the returned value of the method .
    @AfterReturning(value="execution(* com.sisyphus.springaop.springaop.business.*.*(..))",
            returning="result")
    public void afterReturning(JoinPoint joinPoint, Object result) {
        logger.info("{} returns with value - {}", joinPoint, result);
    }

    //this is used to catch any exception thrown
    @AfterThrowing(value = "execution(* com.sisyphus.springaop.springaop.business.*.*(..))", throwing = "exception")
    public void afterThrowing(JoinPoint joinPoint, Object exception) {
        logger.info("{} throws  {} exception", joinPoint, exception);
    }

    // this is used after a method has retuned , and wont hold either a value or an exception thrown
    @After(value = "execution(* com.sisyphus.springaop.springaop.business.*.*(..))")
    public void after(JoinPoint joinPoint) {
        logger.info("After succesfully returning  {} ", joinPoint);
    }

}