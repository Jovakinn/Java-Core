package org.reflection.model;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface CompanyRelated {
    String CompanyName() default "Apple";
    int yearOfCompanyCreation() default 1976;
}
