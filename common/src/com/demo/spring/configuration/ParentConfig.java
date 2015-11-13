package com.spring.configuration;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;

import com.spring.configuration.bean.Account;

@Configurable
@Import(ChildConfig.class)
public class ParentConfig {
	 @Bean
	   public Account account() {
	      System.out.println("Account bean created.");
	     // return new Account(accountDetails()); 
	      return null;
	   }
	 /*@Bean
	   public AccountDetails accountDetails() {
	      System.out.println("Account Details bean created.");
	      return new AccountDetails(); 
	   }*/
}
