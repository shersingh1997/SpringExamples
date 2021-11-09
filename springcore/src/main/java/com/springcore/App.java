package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    private static ApplicationContext  context;

	public static void main( String[] args )
    {
        System.out.println( "Program started..." );
        
     context = new ClassPathXmlApplicationContext("com/springcore/config.xml");
    Student s1=(Student) context.getBean("Student1");
    System.out.println(s1);
    }
}
