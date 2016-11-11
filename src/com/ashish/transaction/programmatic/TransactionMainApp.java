package com.ashish.transaction.programmatic;

import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.ashish.transaction.programmatic.StudentJDBCTemplate;

public class TransactionMainApp {
   @SuppressWarnings("resource")
public static void main(String[] args) {
	   
      ApplicationContext context = new ClassPathXmlApplicationContext("transactionprogramaticspring.xml");

      StudentJDBCTemplate studentJDBCTemplate =  (StudentJDBCTemplate)context.getBean("studentJDBCTemplate");
      
      /*System.out.println("------Records creation--------\n" );
      studentJDBCTemplate.create("Ashish", 26, 99, 2010);
      studentJDBCTemplate.create("Tanya", 25, 97, 2010);
      studentJDBCTemplate.create("Rahul", 27, 100, 2011);*/

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
 * http://www.tutorialspoint.com/spring/programmatic_management.htm
 */