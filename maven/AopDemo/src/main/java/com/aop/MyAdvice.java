package com.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAdvice {
	@Before("execution(* com.bean.M*.m*(..))")
	public void beforeAdvice()
	{
		System.out.println("before advice");
	}
	@After("execution(* com.bean.M*.m*(..))")
	public void afterAdvice()
	{
		System.out.println("after advice");
	}
	@Around("execution(* com.bean.M*.m*(..))")
	public Object aroundadvice(ProceedingJoinPoint jpoint)throws Throwable 
	{
		System.out.println("before around advice call");
		Object ob=jpoint.proceed();
		System.out.println("after around advice call");
		return ob;
		
	}

}
