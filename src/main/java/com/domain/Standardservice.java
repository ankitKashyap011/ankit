package com.domain;

import com.interfaces.IStandardservice;
import com.main.Customer;

public class Standardservice implements IStandardservice {

	public String sayWelcome(Customer customer) {
		return "Welcome "+customer.getFirstName()+ " "+ customer.getLastName()
				+". You are eligible for Standered Meal.";
	}

	


}
