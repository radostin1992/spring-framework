package com.radostin.springdemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.radostin.springdemo.dao.OrganizationDao;
import com.radostin.springdemo.domain.Organization;

@Service
public class OrganizationService {

	@Autowired
	private OrganizationDao organizationDao;

	public List<Organization> getOrgList() {
		List<Organization> orgList = organizationDao.getAllOrganizations();
		return orgList;
	}
}
