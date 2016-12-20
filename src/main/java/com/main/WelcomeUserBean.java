package com.main;

import java.util.Calendar;

import com.domain.HappyHourService;
import com.domain.Standardservice;

public class WelcomeUserBean {
	public Customer name;
	public HappyHourService happyHourService;
	public Standardservice standardservice;
	public Customer getName() {
		return name;
	}
	public void setName(Customer name) {
		this.name = name;
	}
	public HappyHourService getHappyHourService() {
		return happyHourService;
	}
	public void setHappyHourService(HappyHourService happyHourService) {
		this.happyHourService = happyHourService;
	}
	public Standardservice getStandardservice() {
		return standardservice;
	}
	public void setStandardservice(Standardservice standardservice) {
		this.standardservice = standardservice;
	}
	
	public String welcomeUser(Customer cust) {
		Calendar calendar = Calendar.getInstance();
		if(calendar.get(Calendar.HOUR_OF_DAY)>= 10 && calendar.get(Calendar.HOUR_OF_DAY) <= 12){
			return happyHourService.sayWelcome(cust);
		}
		else
		return standardservice.sayWelcome(cust);
		
	}
}
