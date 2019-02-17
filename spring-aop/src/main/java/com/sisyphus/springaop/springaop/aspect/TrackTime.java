package com.sisyphus.springaop.springaop.aspect;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD) // this allows us to specify a target for the annotation , ehich means we can only decorate
//the target element with our annotation
@Retention(RetentionPolicy.RUNTIME) // this allows us to set the limit of retenion of the annotation workflow
// here we set runtime , because we want thr annotation to continue running even at runtime
public @interface TrackTime {

}