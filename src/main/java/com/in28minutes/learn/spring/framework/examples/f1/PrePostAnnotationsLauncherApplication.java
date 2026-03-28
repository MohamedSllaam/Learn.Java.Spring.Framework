package com.in28minutes.learn.spring.framework.examples.f1;

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
 
@Component
class  SomeDependency
{
public SomeDependency(){
	 System.out.println("Some Inintialization logic");

}

public void getReady() {
	System.out.println("SomeDependency SomeDependency ready"); 
	
}
}

//@Scope(value= ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Component
class  SomeClass
{

	 private SomeDependency classA;

	 public SomeClass(SomeDependency classA) {
		 super();
		 this.classA = classA;
		 System.out.println("All dependencies are ready");  	 			
	 }
	
	 @PostConstruct
	 public void initialize() {
		 this.classA .getReady();
	 }
	 
	 @PreDestroy
	 public void CleanUp() {
		 System.out.println( 
				 "Clean up "
			);
	 }
}

@Configuration
@ComponentScan
public class PrePostAnnotationsLauncherApplication {

	public static void main(String[] args) {

		try(var context =new AnnotationConfigApplicationContext(PrePostAnnotationsLauncherApplication.class))
      		{
			
			Arrays.stream(context.getBeanDefinitionNames())
			.forEach(System.out::println);
			System.out.println("Initialztion of context is completed");
			//context.getBean(SomeClass.class).doSomeThing();
			
			System.out.println(context.getBean(SomeDependency.class));
			System.out.println(context.getBean(SomeDependency.class));
			
			System.out.println(context.getBean(SomeClass.class));
		
			//System.out.print(context.getBean(YourBusinessClass.class));
      		}
	}
}
