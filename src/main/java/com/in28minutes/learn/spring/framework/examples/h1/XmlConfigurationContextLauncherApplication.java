package com.in28minutes.learn.spring.framework.examples.h1;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.in28minutes.learn.spring.framework.game.GameRunner;
import com.in28minutes.learn.spring.framework.game.GamingConsole;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import jakarta.inject.Inject;
import jakarta.inject.Named;
 
//@Component
@Named
class  BusinessService
{
	private DataService dataService;

//@Autowired
@Inject
public DataService getDataService() 
{
	System.out.println("Setter Injection");
return dataService;	
}
 public void setDataService(DataService dataService) 
 {
//System.out.println("Setter Injection");
	this.dataService= dataService;
 }
}


class DataService 
{
	
}

@Configuration
@ComponentScan
public class XmlConfigurationContextLauncherApplication {

	public static void main(String[] args) {

		try(var context =new AnnotationConfigApplicationContext(XmlConfigurationContextLauncherApplication.class))
      		{
			
			Arrays.stream(context.getBeanDefinitionNames())
			.forEach(System.out::println);
			System.out.println("Initialztion of context is completed");
			
      		}
	}
}
