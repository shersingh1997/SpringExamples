package com.Constructor_Inj;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	System.out.println( "Program started..." );
        
       ApplicationContext context = new ClassPathXmlApplicationContext("com/Constructor_Inj/Config.xml");
       Student s1=(Student) context.getBean("Student1");
       System.out.println(s1);
    }
}
