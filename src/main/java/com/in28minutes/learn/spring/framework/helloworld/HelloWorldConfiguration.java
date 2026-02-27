package com.in28minutes.learn.spring.framework.helloworld;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

record Person(String name , int age, Address address) {}
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
	public int age4() 
	{
		
	 return 153;	
	}
	
	@Bean
	public Person person() 
	{
	 return new Person(this.name(),this.age(), this.address());	
	}
	
	@Bean
	public Person person3Parameters
	(String name, int age3,  @Qualifier("address2")  Address address)
	{
	 return new Person(name,age3,address);	
	}
	
	@Bean(name="address2")
	@Primary
	public Address address() 
	{
	 return new Address("sallam","sallam");	
	}
	
	@Bean(name="address3")
	public Address address3() 
	{
	 return new Address("Baker Street","London");	
	}
}
