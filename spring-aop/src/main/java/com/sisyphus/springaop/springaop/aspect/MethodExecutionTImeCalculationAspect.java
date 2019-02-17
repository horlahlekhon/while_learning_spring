package com.sisyphus.springaop.springaop.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class MethodExecutionTImeCalculationAspect {

    private Logger logger = LoggerFactory.getLogger(this.getClass());


    // this Aspect is used track the execution time of methods, it uses a joinPoint which is diff from 
    //the rest of the Aspects , ProceedingJoinPoint allows the advice to continue to run 
    @Around( "com.sisyphus.springaop.springaop.aspect.CommonJointPointConfig.trackTimeAnnotation()")
    public void arounc(ProceedingJoinPoint joinPoint) throws Throwable {
        Long startTime = System.currentTimeMillis();
        joinPoint.proceed(); // this will allow the method to run

        Long timeTaken = System.currentTimeMillis() - startTime;
        logger.info("time taken by this {}  is {} ", joinPoint, timeTaken);
    }
    
}