package com.ashish.springjdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.ashish.springjdbc.StudentJDBCTemplate;

public class DropTableMainApp {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("jdbcspring.xml");
	    StudentJDBCTemplate studentJDBCTemplate = (StudentJDBCTemplate)context.getBean("studentJDBCTemplate");
	    System.out.println("---------Droping the table Student---------");
	    studentJDBCTemplate.dropTableStudent();
	}

}
