package com.springframework.demo.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface TestPark {

    ParkType type() default ParkType.PUBLIC;

    public static enum ParkType{
        PUBLIC,
        PRIVATE,
        ;
    }

}
