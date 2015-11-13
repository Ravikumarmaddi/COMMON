package com.spring.configuration;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;

import com.spring.configuration.bean.AccountDetails;

@Configurable
public class ChildConfig {
	  @Bean
	   public AccountDetails accountDetails() {
	      System.out.println("Account Details bean created."); 
	      return new AccountDetails(); 
	   }
}
