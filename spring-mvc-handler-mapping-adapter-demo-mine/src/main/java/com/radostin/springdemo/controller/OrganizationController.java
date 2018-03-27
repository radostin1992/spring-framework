package com.radostin.springdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.radostin.springdemo.domain.Organization;
import com.radostin.springdemo.service.OrganizationService;

@Controller
public class OrganizationController {

	@Autowired
	private OrganizationService organizationService;

	@RequestMapping("/jstlsql")
	public String listOrganizationsUsingSQLTag() {
		return "listOrganization1";
	}

	@RequestMapping("/")
	public String requestHomePage() {
		return "home";
	}

	@RequestMapping("/service")
	public String listOrganizationUsingService(Model model) {
		List<Organization> orgs = organizationService.getOrgList();
		model.addAttribute("orgList", orgs);
		return "listOrganization2";
	}

}
