package com.radostin.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.radostin.springdemo.domain.Organization;

public class PropertiesWithXmlApp {

	public static void main(String[] args) {
		// create application context (container)
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-cp.xml");

		Organization org = (Organization) ctx.getBean("myorg");
		System.out.println(org);

		// close the application context (container)
		((ClassPathXmlApplicationContext) ctx).close();
	}

}
