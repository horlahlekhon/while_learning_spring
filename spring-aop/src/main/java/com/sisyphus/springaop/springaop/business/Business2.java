package com.sisyphus.springaop.springaop.business;

import com.sisyphus.springaop.springaop.aspect.TrackTime;
import com.sisyphus.springaop.springaop.data.Dao2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Business2 {

    @Autowired
    Dao2 dao2;

    //we create an annotation that implements aop to track time for any method that we decorate with 
    //the annotation, instead of running an aspect that tracks time for all the methods.
    @TrackTime 
    public String calculateSomething() {
        return dao2.retrieveSomething();
    }
}