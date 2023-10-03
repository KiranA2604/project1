package com.example.spring;

import org.apache.catalina.core.ApplicationContext;
import org.apache.catalina.core.ApplicationContext.*;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class mobile
{
	public static void main(String[] args) 
	{
	     ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
	   System.out.println("successful");
	    sim air= (airtel) context.getBean("airtel" ,sim.class);
	     air.calling();
	     air.data();
	     
	   
	}

}
