package com.ashish.log4j;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.apache.log4j.Logger;

public class Log4jMainApp {

   static Logger log = Logger.getLogger(Log4jMainApp.class.getName());

   @SuppressWarnings("resource")
public static void main(String[] args) {
	  
      ApplicationContext context = new ClassPathXmlApplicationContext("log4jspring.xml");

      log.info("++++++++++ Going to create HelloWord Obj ++++++++++");

      HelloWorld obj = (HelloWorld) context.getBean("helloWorld");

      obj.getMessage();

      log.info("++++++++++ Exiting the program ++++++++++");
   }
}

/*
 * http://www.tutorialspoint.com/spring/logging_with_log4j.htm
 */