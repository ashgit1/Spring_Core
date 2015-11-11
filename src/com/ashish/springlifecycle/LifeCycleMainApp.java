package com.ashish.springlifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.ashish.springlifecycle.LifeCycle;

public class LifeCycleMainApp {
	
	@SuppressWarnings("resource")
	public static void main(String args[]){
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("lifecyclespring.xml");
		LifeCycle lifeCycle = (LifeCycle) context.getBean("lifeCycle");
		lifeCycle.getMessage();
		context.registerShutdownHook();
	}
	
}

/*
 * http://www.tutorialspoint.com/spring/spring_bean_life_cycle.htm
 */
