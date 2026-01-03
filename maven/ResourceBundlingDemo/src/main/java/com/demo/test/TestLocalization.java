package com.demo.test;

import java.util.Locale;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.MessageSource;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.ResourceBundleMessageSource;

public class TestLocalization {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ApplicationContext ctx = new ClassPathXmlApplicationContext("springconfig.xml");
		MessageSource ms = (MessageSource)ctx.getBean(ResourceBundleMessageSource.class);
		System.out.println("1.marathi\n2.US english\n3.UK english\n4.oothers\nchoice:");
		int choice = sc.nextInt();
		Locale locale=null;
		switch(choice) {
		case 1:{
			locale=new Locale("my","marathi");
			System.out.println("country name :"+locale.getCountry()+"language"+locale.getLanguage());	
			break;
		}
		case 2:{
			locale=Locale.US;
			System.out.println("country name :"+locale.getCountry()+"language"+locale.getLanguage());	
			break;
		}
		case 3:{
			locale=Locale.UK;
			System.out.println("country name :"+locale.getCountry()+"language"+locale.getLanguage());	
			break;
		}
		}
	   String msg = ms.getMessage("msg.pay", null,locale);
	   String welcome = ms.getMessage("msg.welcome", new Object[] {"shivam"},locale);
	   String bill = ms.getMessage("msg.billmsg", null,locale);
	   String currency = ms.getMessage("msg.currency", null,locale);
	   
	   System.out.println(msg);
	   System.out.println(welcome);
	   System.out.println(bill);
	   double amount = sc.nextDouble();
	   System.out.println("your bill amount"+amount+" "+currency+"is recived");

	}

}
