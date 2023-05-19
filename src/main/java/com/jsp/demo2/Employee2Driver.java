package com.jsp.demo2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Employee2Driver {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MyConfigg.class);
		Employee2 employee2 = (Employee2) applicationContext.getBean("employee2");
		employee2.print();
	}

}
