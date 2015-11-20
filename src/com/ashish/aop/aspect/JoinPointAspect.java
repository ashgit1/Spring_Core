package com.ashish.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class JoinPointAspect {

	
	/**
	 * Point cut to apply for all the methods of Circle class.
	 */
	/*@Pointcut("within(com.ashish.aop.model.Circle)")
	public void allCircleMethods(){}
	
	@Before("allCircleMethods()")
	public void loggingAdvice(JoinPoint joinPoint){
		System.out.println("Method called : " + joinPoint.toString());  // returns the method name...
		System.out.println("Object called : " + joinPoint.getTarget()); // returns the object of the methods...
	}*/
	
	/**
	 * Advice arguments: Need to know what argument is passed to the advice methods ?
	 * Works for all methods that takes a single string argument.
	 */
	/*@Before("args(name)")
	public void stringArgumentMethodAdviced(String name){
		System.out.println("Method that takes string arguments has been called : " + name);
	}*/
	
	/*@After("args(name)")
	public void stringArgumentMethod(String name){
		System.out.println("Method that takes string arguments has been called : " + name);
	}*/
	
	/*@AfterReturning("args(name)")
	public void stringArgumentMethodAdviced(String name){
		System.out.println("This will be executed only if the target method is executed successfully unlike @After.");
	}*/
	
	/*@AfterThrowing("args(name)")
	public void stringArgumentMethodAdviced(String name){
		System.out.println("This will be executed even if the target method throws some exception.");
	}*/
	
	/**
	 * Handles the output returned from the target method.
	 */
	@AfterReturning(pointcut="args(name)", returning="returnString")
	public void stringArgumentMethodAfterReturningAdviced(String name, String returnString){
		System.out.println("Method that takes single argument has been called. Input value : " + name + 
							", output value: " + returnString);
	}
	
	/**
	 * This advice is run on methods with single parameter and which throws some exception. 
	 */
	/*@AfterThrowing(pointcut="args(name)", throwing="ex")
	public void exceptionAdviced(String name, Exception ex){
		System.out.println("An exception is thwown : " + ex.toString());
	}*/
	
}

/**
 *  JoinPoints are the points at which Advice are run...
 *  It contains the method information like which method was invoked.
 *  The join point arguments is referred to as Advice arguments.
  */
