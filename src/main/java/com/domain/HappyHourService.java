package com.domain;

import com.interfaces.IHappyHourService;
import com.main.Customer;

public class HappyHourService implements IHappyHourService {

	public String sayWelcome(Customer customer) {
		return "Welcome "+customer.getFirstName()+ " "+ customer.getLastName()
				+". You are eligible for Happy Hour Meal.";
	}

	

}
