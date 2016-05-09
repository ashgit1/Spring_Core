package com.ashish.eventhandling;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EventHandlingMainApp {
	
public static void main(String[] args) {
	
      ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("eventhandlingspring.xml");
      // Let us raise a start event.
      context.start();
	  
      HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
      obj.getMessage();

      // Let us raise a stop event.
      context.stop();
      
      // Let us refresh the context
      context.refresh();
      
      // Let us close the application context
      context.close();
      
      /*After closing the application context it will not open again.
      A closed context reaches its end of life; it cannot be refreshed or restarted.*/
      context.start();
      
   }
}

/*
 * http://www.tutorialspoint.com/spring/event_handling_in_spring.htm
 */
