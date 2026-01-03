package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bean.MyUser;

public class TestMyUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ApplicationContext ctx=new ClassPathXmlApplicationContext("springconfig.xml");
MyUser u=(MyUser)ctx.getBean("myUser");
System.out.println(u);
u.m1();
int ans=u.m2(10);
System.out.println(ans);
System.out.println(u.getName());
	}

}
