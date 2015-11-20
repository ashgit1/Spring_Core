package com.ashish.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ashish.aop.service.ShapeService;

public class AopJoinPoint {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("aopjoinpointspring.xml");
		ShapeService shapeService = ctx.getBean("shapeService", ShapeService.class);
		//System.out.println(shapeService.getTriangle().getName());
		
		/*shapeService.getCircle().setName("Dummy circle");
		System.out.println(shapeService.getCircle().getName());*/
		
		shapeService.getCircle().setNameAndReturn("Dummy Circle 2");
		System.out.println(shapeService.getCircle().getName());
		
	}
}

/*
 * The setter will be printed twice. First one will be spring container setter and the latter will be setName() method.
 */