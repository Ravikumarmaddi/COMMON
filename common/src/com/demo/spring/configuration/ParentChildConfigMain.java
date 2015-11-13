package com.spring.configuration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;

import com.spring.configuration.bean.Account;
import com.spring.configuration.bean.AccountDetails;

@Configuration
public class ParentChildConfigMain {
	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(
				ParentConfig.class);

		Account account = ctx.getBean(Account.class);
		AccountDetails accountDetails = ctx.getBean(AccountDetails.class);

	}
}