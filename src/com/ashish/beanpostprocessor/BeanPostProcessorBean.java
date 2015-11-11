package com.ashish.beanpostprocessor;

public class BeanPostProcessorBean {
	
	private String message;

	   public void setMessage(String message){
	      this.message  = message;
	   }

	   public void getMessage(){
	      System.out.println("Your Message : " + message);
	   }

	   public void init(){
	      System.out.println("Bean is going through init in BeanPostProcessorBean.");
	   }

	   public void destroy(){
	      System.out.println("Bean will destroy now in BeanPostProcessorBean.");
	   }

}
