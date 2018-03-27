package com.radostin.springdemo.daoimpl;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.radostin.springdemo.dao.OrganizationDao;
import com.radostin.springdemo.domain.Organization;

@Repository("orgDao")
public class OrganizationDaoImpl implements OrganizationDao {

	private JdbcTemplate jdbcTemplate;

	@Autowired
	public void setDataSource(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}

	public boolean create(Organization org) {
		// TODO Auto-generated method stub
		return false;
	}

	public Organization getOrganization(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Organization> getAllOrganizations() {
		String sqlQuery = "SELEC * FROM organization";
		List<Organization> orgList = jdbcTemplate.query(sqlQuery, new OrganizationRowMapper());

		return orgList;
	}

	public boolean delete(Organization org) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean update(Organization org) {
		// TODO Auto-generated method stub
		return false;
	}

	public void clenup() {
		// TODO Auto-generated method stub

	}

}
