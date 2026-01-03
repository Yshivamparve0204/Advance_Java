package com.demo.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.beans.HelloWorld;

public class TestHelloWorld {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("springconfig.xml");
		HelloWorld hwbean = (HelloWorld)ctx.getBean("hw");

		String msg = hwbean.sayHello();
		System.out.println("message "+msg);
		
		
		((ClassPathXmlApplicationContext)ctx).close();

	}

}
