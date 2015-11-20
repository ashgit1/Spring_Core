package com.ashish.springjdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.ashish.springjdbc.StudentJDBCTemplate;

public class MainApp {
   @SuppressWarnings("resource")
public static void main(String[] args) {
	   
      ApplicationContext context = new ClassPathXmlApplicationContext("jdbcspring.xml");
      StudentJDBCTemplate studentJDBCTemplate = (StudentJDBCTemplate)context.getBean("studentJDBCTemplate");
      
      System.out.println("------Records Creation--------" );
      studentJDBCTemplate.create("Ashish", 26);
      studentJDBCTemplate.create("Tanya", 25);
      studentJDBCTemplate.create("Rahul", 27);
      studentJDBCTemplate.create("Dummy Person", 37);

      System.out.println("------Listing Multiple Records--------" );
      List<Student> students = studentJDBCTemplate.listStudents();
      for (Student record : students) {
         System.out.print("ID : " + record.getId() );
         System.out.print(", Name : " + record.getName() );
         System.out.println(", Age : " + record.getAge());
      }

      System.out.println("----Updating Record with ID = 2 -----" );
      studentJDBCTemplate.update(2, 24);

      System.out.println("------Listing Multiple Records after update--------" );
      List<Student> students2 = studentJDBCTemplate.listStudents();
      for (Student record : students2) {
         System.out.print("ID : " + record.getId() );
         System.out.print(", Name : " + record.getName() );
         System.out.println(", Age : " + record.getAge());
      }

      
      System.out.println("----Listing Record with ID = 1 -----" );
      Student student = studentJDBCTemplate.getStudent(1);
      System.out.print("ID : " + student.getId() );
      System.out.print(", Name : " + student.getName() );
      System.out.println(", Age : " + student.getAge());
	  
      System.out.println("----Deleting Record with ID = 4 -----" );
      studentJDBCTemplate.delete(4);
      
      System.out.println("------Listing Multiple Records after deleting student with id = 4 --------" );
      List<Student> students1 = studentJDBCTemplate.listStudents();
      for (Student record : students1) {
         System.out.print("ID : " + record.getId() );
         System.out.print(", Name : " + record.getName() );
         System.out.println(", Age : " + record.getAge());
      }

   }
}