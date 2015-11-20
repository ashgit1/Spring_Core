package com.ashish.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggingAspect {
	
	/**
	 * Execute this aspect on all the getName() methods.
	 */
	@Before("execution(public String getName())")
	public void loggingAdvice(){
		System.out.println("Generic Advice run. Get method called.");
	}

	/**
	 * Execute this aspect only on getName() of circle.
	 */
	@Before("execution(public String com.ashish.aop.model.Circle.getName())")
	public void circleAdvice(){
		System.out.println("Circle Advice Run....");
	}
	
	/**
	 * Execute this aspect on all the getter methods irrespective of return type.
	 */
	@Before("execution(* get*())")
	public void getterAdvice(){
		System.out.println("Getter advice called...");
	}
	
	/**
	 * Advice for all the getter methods with single attribute.
	 */
	@Before("execution(* get*(*))")
	public void getterForSingleAttributeAdvice(){
		System.out.println("advice for single attribute getter method...");
	}
	
	/**
	 * Advice for all the getter methods with zero or more attribute.
	 */
	@Before("execution(* get*(..))")
	public void getterForSingleOrMoreAttributeAdvice(){
		System.out.println("zero or more attribute advice called...");
	}
	
}
