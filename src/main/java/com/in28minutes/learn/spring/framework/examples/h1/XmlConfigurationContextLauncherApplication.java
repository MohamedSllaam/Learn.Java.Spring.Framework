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
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import com.in28minutes.learn.spring.framework.game.GameRunner;
import com.in28minutes.learn.spring.framework.game.GamingConsole;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import jakarta.inject.Inject;
import jakarta.inject.Named;
 
//@Component
@ComponentScan
public class XmlConfigurationContextLauncherApplication {

	public static void main(String[] args) {

		try(var context =new ClassPathXmlApplicationContext("ContextConfiguration.xml"))
      		{
			
			Arrays.stream(context.getBeanDefinitionNames())
			.forEach(System.out::println);
			System.out.println("Initialztion of context is completed");
			
			System.out.println(context.getBean("name"));
			
      		}
	}
}
