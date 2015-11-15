package com.ashish.eventhandling.custom;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CustomEventMainApp {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		ConfigurableApplicationContext context =  new ClassPathXmlApplicationContext("eventhandlingcustomspring.xml");
				  
		CustomEventPublisher cvp = (CustomEventPublisher) context.getBean("customEventPublisher");
		cvp.publish();  
		//cvp.publish();
	}
}

/*
 * http://www.tutorialspoint.com/spring/custom_events_in_spring.htm
 */