package com.ashish.aop.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class PointCutAspect {
	
	/**
	 * Defining point cuts on all the getter methods irrespective of return type.
	 */
	@Pointcut("execution(* get*())")
	public void allGetters(){}
	
	@Before("allGetters() && allCircleMethods()")
	public void loggingAdvice(){
		System.out.println("Logging Advice...");
	}
	
	@Before("allGetters()")
	public void secodAdvice(){
		System.out.println("Second Advice...");
	}
	
	/**
	 * Point cut to apply for all the methods of Circle class.
	 */
	@Pointcut("within(com.ashish.aop.model.Circle)")
	public void allCircleMethods(){}
	
	@After("allCircleMethods()")
	public void circleAdvice(){
		System.out.println("Circle class method was called...");
	}
}
