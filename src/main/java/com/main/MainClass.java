package com.main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/*
import com.domain.HelloWorld;
import com.interfaces.IHelloWorld;
*/

public class MainClass {
	
	public static void main(String... str){
		
		ApplicationContext bean = new ClassPathXmlApplicationContext("appXmls\\AppXml.xml");
		BeanFactory factory = (BeanFactory) bean;
		//IHelloWorld helloworldObj = (HelloWorld) factory.getBean("helloWorld");
		//helloworldObj.setMessage("Hello Java");
		//helloworldObj.displayMessage();
		
		try{
	        WelcomeUserBean userBean =  (WelcomeUserBean) factory.getBean("welcomeUser");
	        Customer cust = (Customer) factory.getBean("customer");
	        	        
	        System.out.println(userBean.welcomeUser(cust));
	        }
	        catch (Exception e) {
				// TODO: handle exception
			}
		
	}

}
