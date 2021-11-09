package com.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.Student;

public class Test {

	public static void main(String[] args) 
	{
		System.out.println("somosa price....");
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/lifecycle/samosaconfig.xml");
	    Samosa s1=(Samosa) context.getBean("Samosa1");
	    System.out.println(s1);
	    context.registerShutdownHook();
		

	}

}
