package com.radostin.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.radostin.springdemo.domain.HumanResourceDept;
import com.radostin.springdemo.domain.Organization;

public class DIConstructorApp {

	public static void main(String[] args) {
		// create application context (container)
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-cp.xml");

		// create the bean
		Organization org = (Organization) ctx.getBean("myorg");

		// invoke the company slogan via the bean
		System.out.println(org.corporateSlogan());

		// Print corporation details
		// System.out.println(org);
		// System.out.println(org.corporateService());
		HumanResourceDept hrdept = (HumanResourceDept) ctx.getBean("myhrdept");
		System.out.println(hrdept.hiringStatus(5500));

		// close the application context (container)
		((ClassPathXmlApplicationContext) ctx).close();
	}

}
