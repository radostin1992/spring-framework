package com.radostin.springdemo;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.BadSqlGrammarException;

import com.radostin.springdemo.dao.OrganizationDao;
import com.radostin.springdemo.daoimpl.OrganizationDaoImpl;
import com.radostin.springdemo.domain.Organization;

public class JdbcTemplateExceptionApp {
	public static void main(String[] args) {
		// Creating the application context
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-cp.xml");

		// Create bean
		OrganizationDao dao = (OrganizationDaoImpl) ctx.getBean("orgDao");

		List<Organization> orgs = null;
		try {
			orgs = dao.getAllOrganizations();
		} catch (BadSqlGrammarException bge) {
			System.out.println("SUB EXCEPTION MESSAGE: " + bge.getMessage());
			System.out.println("SUB EXCEPTION CLASS: " + bge.getClass());
		} catch (DataAccessException dae) {
			System.out.println("EXCEPTION MESSAFE: " + dae.getMessage());
			System.out.println("EXCEPTION CLASS: " + dae.getClass());
		}

		for (Organization org : orgs) {
			System.out.println(org);
		}

		// close the application context
		((ClassPathXmlApplicationContext) ctx).close();
	}
}
