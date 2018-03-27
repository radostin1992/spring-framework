package com.radostin.springdemo;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.radostin.springdemo.dao.OrganizationDao;
import com.radostin.springdemo.daoimpl.OrganizationDaoImpl;
import com.radostin.springdemo.domain.Organization;

public class JdbcTemplateClassicApp1 {
	public static void main(String[] args) {
		// Creating the application context
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-cp.xml");

		// Create bean
		OrganizationDao dao = (OrganizationDaoImpl) ctx.getBean("orgDao");
		List<Organization> orgs = dao.getAllOrganizations();
		for (Organization org : orgs) {
			System.out.println(org);
		}

		// close the application context
		((ClassPathXmlApplicationContext) ctx).close();
	}
}
