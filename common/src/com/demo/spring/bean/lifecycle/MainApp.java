package com.spring.bean.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.configuration.bean.Foo;

public class MainApp {
	public static void main(String[] args) {
	      ApplicationContext ctx = 
	    	      new AnnotationConfigApplicationContext(AppConfig.class);
	    	   
	    	      Foo helloWorld = ctx.getBean(Foo.class);
	    	   }
}