package com.in28minutes.learn.spring.framework.examples.a2;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.in28minutes.learn.spring.framework.game.GameRunner;
import com.in28minutes.learn.spring.framework.game.GamingConsole;


 interface DataService 
{
	int[] returnData();
}
 
//@Component
 @Repository
//@Primary
 class  MongoDBDataService implements DataService
 {

	@Override
	public int[] returnData() {
		return new int[] {
				11,12,13,14,15
		};
	}
	 
 }
 
//@Component
@Repository
@Primary
 class MySqlDataService implements DataService
 {

	@Override
	public int[] returnData() {
		return new int[] {
              1,2,3,4,5,6,7,8,9		
                         };
	}
	 
 }
 
@Service 
//@Component
class  YourBusinessClass
{
	private DataService dataService;
	
	public YourBusinessClass(DataService _dataService){
		super();
		this.dataService= _dataService;
	}
	
	public int findMax() {
		return Arrays.stream(dataService.returnData()).max().orElse(0);
	}
	//@Autowired	 
	

	 
}

 

@Configuration
@ComponentScan
public class SimpleSpringContextLauncherApplication {

	public static void main(String[] args) {

		try(var context =new AnnotationConfigApplicationContext(SimpleSpringContextLauncherApplication.class))
      		{
			
			Arrays.stream(context.getBeanDefinitionNames())
			.forEach(System.out::println);
			
			System.out.print("beans "+context.getBean(YourBusinessClass.class).findMax());
      		}
	}
}
