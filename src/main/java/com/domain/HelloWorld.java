package com.domain;

import com.interfaces.IHelloWorld;

public class HelloWorld implements IHelloWorld {

	private String message;

	public HelloWorld(String message) {
		this.message =  message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public void displayMessage() {
		System.out.println(message);
	}

}
