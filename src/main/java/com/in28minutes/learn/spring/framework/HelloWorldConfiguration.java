package com.in28minutes.learn.spring.framework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person(String name , int age) {}
record Address(String firstLine , String city) {}

@Configuration
public class HelloWorldConfiguration {
   int iage= 12;
	@Bean
	public String name() 
	{
	 return "Ranga";	
	}
	
	@Bean
	public int age() 
	{
		this.iage= this.iage+1;
	 return this.iage;	
	}
	@Bean
	public int age2() 
	{
		this.iage= this.iage+1;
	 return this.iage;	
	}
	
	@Bean
	public int age3() 
	{
		this.iage= this.iage+1;
	 return this.iage;	
	}
	
	@Bean
	public Person person() 
	{
	 return new Person(this.name(),this.age());	
	}
	
	@Bean(name="address2")
	public Address address() 
	{
	 return new Address("Baker Street","London");	
	}
}
