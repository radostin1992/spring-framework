package com.radostin.springdemochallenge;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class IOCAppChallenge1 {
	public static void main(String[] args) {
		// create application context (container)
		ApplicationContext ctx = new FileSystemXmlApplicationContext("src/main/resources/beans-challenge.xml");

		// create the bean
		City city = (City) ctx.getBean("mycity");

		// invoke the company slogan via the bean
		city.cityName();

		// close the application context (container)
		((FileSystemXmlApplicationContext) ctx).close();
	}
}
