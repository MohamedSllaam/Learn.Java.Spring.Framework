package com.in28minutes.learn.spring.framework.examples.d1;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import com.in28minutes.learn.spring.framework.game.GameRunner;
import com.in28minutes.learn.spring.framework.game.GamingConsole;
 
@Component
class  ClassA
{
public ClassA(){
	 System.out.println("Some Inintialization logic");

}
}

@Component
@Lazy
class  ClassB
{

	 private ClassA classA;

	 public ClassB(ClassA classA) {
		 this.classA = classA;
		 System.out.println("Some Inintialization logic");  	 			
	 }
	
	 public void doSomeThing() {
		 System.out.println("doSome Thing");
	 }
}

@Configuration
@ComponentScan
public class SimpleSpringContextLauncherApplication {

	public static void main(String[] args) {

		try(var context =new AnnotationConfigApplicationContext(SimpleSpringContextLauncherApplication.class))
      		{
			
			Arrays.stream(context.getBeanDefinitionNames())
			.forEach(System.out::println);
			System.out.println("Initialztion of context is completed");
			context.getBean(ClassB.class).doSomeThing();
			//System.out.print(context.getBean(YourBusinessClass.class));
      		}
	}
}
