package com.in28minutes.learn.spring.framework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloWorldConfiguration {
 
	@Bean
	public String name() 
	{
	 return "Ranga";	
	}
}
