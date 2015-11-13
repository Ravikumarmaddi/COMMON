package com.spring.bean.scopes;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.spring.configuration.bean.Foo;

@Configuration
public class AppConfig {
	@Bean(initMethod = "init", destroyMethod = "cleanup")
	@Scope("prototype")
	public Foo foo() {
		return new Foo();
	}
}