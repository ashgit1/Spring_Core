package com.ashish.javaannotation.others;

public class Foo {

	public void init() {
	      System.out.println("Foo init...");
	   }
	
	   public void cleanup() {
	      System.out.println("Foo destroyed...");
	   }
	   
	   Foo(){
		   System.out.println("Inside Foo Constructor...");
	   }
	   
	   public void getFoo(){
		   System.out.println("this is getFoo method...");
	   }
}