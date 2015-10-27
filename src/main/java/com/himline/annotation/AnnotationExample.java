package com.himline.annotation;

import java.io.FileNotFoundException;
import java.util.*;

public class AnnotationExample {
	 
    public static void main(String[] args) {
    	List l = new ArrayList();
        l.add("abc");
        oldMethod();
    }
 
    @Override
    @Methodinfo(author = "Pankaj", comments = "Main method", date = "Nov 17 2012", revision = 1)
    public String toString() {
        return "Overriden toString method";
    }
 
    
    @Methodinfo(comments = "deprecated method", date = "Nov 17 2012")
    public static void oldMethod() {
        System.out.println("old method, don't use it.");
    }
 
    @SuppressWarnings({ "unchecked", "deprecation" })
    @Methodinfo(author = "Pankaj", comments = "Main method", date = "Nov 17 2012", revision = 10)
    public static void genericsTest() throws FileNotFoundException {
        
    }
 
}