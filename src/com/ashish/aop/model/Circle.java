package com.ashish.aop.model;

public class Circle {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		System.out.println("Circle Setter is called...");
		/*throw (new RuntimeException());*/
	}
	
	public String setNameAndReturn(String name){
		this.name = name;
		return name;
	}
	
}