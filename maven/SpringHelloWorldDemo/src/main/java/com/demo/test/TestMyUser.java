package com.demo.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.beans.MyUser;



public class TestMyUser {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("springconfig.xml");
		MyUser user = (MyUser)ctx.getBean("u1");
		MyUser user1 = (MyUser)ctx.getBean("u2");
		System.out.println(user);
		System.out.println(user1);
		((ClassPathXmlApplicationContext)ctx).close();

	}

}
