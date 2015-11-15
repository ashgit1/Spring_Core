package com.ashish.eventhandling;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EventHandlingMainApp {
	
@SuppressWarnings("resource")
public static void main(String[] args) {
	
      ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("eventhandlingspring.xml");
      // Let us raise a start event.
      context.start();
	  
      HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
      obj.getMessage();

      // Let us raise a stop event.
      context.stop();
   }
}

/*
 * http://www.tutorialspoint.com/spring/event_handling_in_spring.htm
 */
