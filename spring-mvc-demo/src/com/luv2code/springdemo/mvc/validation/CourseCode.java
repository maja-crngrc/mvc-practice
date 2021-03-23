package com.luv2code.springdemo.mvc.validation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;

import javax.validation.Constraint;
import javax.validation.Payload;

@Constraint(validatedBy = CourseCodeConstraintValidator.class)
@Target( { ElementType.METHOD, ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface CourseCode {
 
	// define default course code
	public String value() default "TEST";
	// define default error message
	public String message() default "must start with TEST";
	// define default groups
	public Class<?>[] groups() default {};
	// define default payloads
	public Class<? extends Payload> [] payload() default {};
	
}
