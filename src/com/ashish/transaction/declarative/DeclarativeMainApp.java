package com.ashish.transaction.declarative;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DeclarativeMainApp {
   @SuppressWarnings("resource")
public static void main(String[] args) {
	   
      ApplicationContext context = new ClassPathXmlApplicationContext("transactiondeclarativespring.xml");

      StudentDAO  studentJDBCTemplate =  (StudentDAO)context.getBean("studentJDBCTemplate");
      
      System.out.println("------Records creation--------" );
      studentJDBCTemplate.create("Zara", 11, 99, 2010);
      studentJDBCTemplate.create("Nuha", 20, 97, 2010);
      studentJDBCTemplate.create("Ayan", 25, 100, 2011);

      System.out.println("\n------Listing all the records--------\n" );
      List<StudentMarks> studentMarks = studentJDBCTemplate.listStudents();
      for (StudentMarks record : studentMarks) {
         System.out.print("ID : " + record.getId() );
         System.out.print(", Name : " + record.getName() );
         System.out.print(", Marks : " + record.getMarks());
         System.out.print(", Year : " + record.getYear());
         System.out.println(", Age : " + record.getAge());
      }
   }
}

/*
 * http://www.tutorialspoint.com/spring/declarative_management.htm
 */