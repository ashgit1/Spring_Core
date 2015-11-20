package com.ashish.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ashish.aop.service.ShapeService;

public class AopMainApp {

	@SuppressWarnings({"resource" })
	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("aopspring.xml");
		ShapeService shapeService = ctx.getBean("shapeService", ShapeService.class);
		//System.out.println(shapeService.getTriangle().getName());
		System.out.println(shapeService.getCircle().getName());
	}

}
