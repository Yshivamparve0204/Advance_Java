package com.demo.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.beans.Faculty;

public class TestData {

	public static void main(String[] args) {
	ApplicationContext ctx = new ClassPathXmlApplicationContext("springconfig.xml");
	Faculty f1=(Faculty)ctx.getBean("f1");
	Faculty f4=(Faculty)ctx.getBean("f4");
	System.out.println(f1);
	System.out.println(f4);
	((ClassPathXmlApplicationContext)ctx).close();

	}

}
