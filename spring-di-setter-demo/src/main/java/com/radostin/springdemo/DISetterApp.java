package com.radostin.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.radostin.springdemo.domain.Organization;

public class DISetterApp {

	public static void main(String[] args) {
		// create application context (container)
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-cp.xml");

		// create the bean
		Organization org = (Organization) ctx.getBean("myorg");

		// invoke the company slogan via the bean
		System.out.println(org.corporateSlogan());

		// Print corporation details
		System.out.println(org);
		System.out.println(org.corporateService());

		// close the application context (container)
		((ClassPathXmlApplicationContext) ctx).close();
	}

}
