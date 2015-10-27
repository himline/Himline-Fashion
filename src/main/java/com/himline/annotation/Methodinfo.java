package com.himline.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.*;

@Documented
@Target(ElementType.METHOD)
@Inherited
@Retention(RetentionPolicy.RUNTIME)
public @interface Methodinfo {
	String author() default "Pankaj";

	String date();

	int revision() default 1;

	String comments();
}