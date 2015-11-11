package com.ashish.beanpostprocessor;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanPostProcessorMainApp {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("beanpostprocessorspring.xml");

		BeanPostProcessorBean obj = (BeanPostProcessorBean) context.getBean("beanPostProcessor");
	    obj.getMessage();
	    context.registerShutdownHook();
	}

}
/**
 * http://www.tutorialspoint.com/spring/spring_bean_post_processors.htm
 */