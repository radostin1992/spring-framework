package com.radostin.service.demo;

import java.util.ArrayList;
import java.util.List;

public class WelcomeService implements GenericWelcomeService {

	public List<String> getWelcomeMessage(String name) {
		List<String> myWelcomeMessages = new ArrayList<String>();

		// Add data to the list
		myWelcomeMessages.add("Hello!");
		myWelcomeMessages.add(name);
		myWelcomeMessages.add(", welcome to the Spring course :-)");

		return myWelcomeMessages;

	}
}
