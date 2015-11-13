package com.spring.bean.scopes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.bean.lifecycle.AppConfig;
import com.spring.configuration.bean.Foo;

public class MainApp {
   public static void main(String[] args) {
	   

		ApplicationContext ctx = new AnnotationConfigApplicationContext(
				AppConfig.class);

		Foo foo1 = ctx.getBean(Foo.class);
		foo1.name = "ssss";
		Foo foo2 = ctx.getBean(Foo.class);
		System.out.println("foo1.name: " + foo1.name);
		System.out.println("foo2.name: " + foo2.name);

	}
}