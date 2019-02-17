package com.sisyphus.springaop.springaop.aspect;

import org.aspectj.lang.annotation.Pointcut;

public class CommonJointPointConfig {

    @Pointcut("execution(* com.sisyphus.springaop.springaop.data.*.*(..))")
    public void dataLayerExecution() {}

    @Pointcut("execution(* com.sisyphus.springaop.springaop.business.*.*(..))")
    public void businessLayerExecution() {}

    //if we want to create a point cut for all layers or two or more layers we can create a seperate point
    //cut that includes the pointcut that we want ti inckude.
    @Pointcut("com.sisyphus.springaop.springaop.aspect.CommonJointPointConfig.dataLayerExecution() && com.sisyphus.springaop.springaop.aspect.CommonJointPointConfig.businessLayerExecution()")
    public void allLayerExecution() {}

    //we can also use bean to scope a point cut
    //this recieves a regex of the bean pattern that we want
    @Pointcut("bean(*dao*)")
    public void pointCutStartingWithBean() {}

    //within the package data
    @Pointcut("within(com.sisyphus.springaop.springaop.data..*)")
    public void dataLayerExecutionWithWithin() {}


    //using custom annotation to narrow down where to apply aop
    @Pointcut("@annotation(com.sisyphus.springaop.springaop.aspect.TrackTime)")
    public void trackTimeAnnotation() {}
}