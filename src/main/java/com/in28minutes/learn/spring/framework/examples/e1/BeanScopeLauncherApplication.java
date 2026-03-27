package com.in28minutes.learn.spring.framework.examples.e1;

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
 
@Component
class  NormalClass
{
//public NormalClass(){
//	 System.out.println("NormalClass Some Inintialization logic");
//
//}

	 private PrototypeClass classA;

	 public NormalClass(PrototypeClass classA) {
		 this.classA = classA;
		 System.out.println("NormalClass  Some Inintialization logic");  	 			
	 }
}

@Scope(value= ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Component
class  PrototypeClass
{

//	 private NormalClass classA;
//
//	 public PrototypeClass(NormalClass classA) {
//		 this.classA = classA;
//		 System.out.println("PrototypeClass Some Inintialization logic");  	 			
//	 }
//	
//	 public void doSomeThing() {
//		 System.out.println("doSome Thing");
//	 }
}

@Configuration
@ComponentScan
public class BeanScopeLauncherApplication {

	public static void main(String[] args) {

		try(var context =new AnnotationConfigApplicationContext(BeanScopeLauncherApplication.class))
      		{
			
			Arrays.stream(context.getBeanDefinitionNames())
			.forEach(System.out::println);
			System.out.println("Initialztion of context is completed");
			//context.getBean(PrototypeClass.class).doSomeThing();
			
			System.out.println(context.getBean(NormalClass.class));
			System.out.println(context.getBean(NormalClass.class));
			
			System.out.println(context.getBean(PrototypeClass.class));
			System.out.println(context.getBean(PrototypeClass.class));
			System.out.println(context.getBean(PrototypeClass.class));
			//System.out.print(context.getBean(YourBusinessClass.class));
      		}
	}
}
