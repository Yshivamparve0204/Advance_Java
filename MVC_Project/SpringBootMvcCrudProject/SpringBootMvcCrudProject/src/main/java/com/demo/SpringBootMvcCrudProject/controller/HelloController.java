package com.demo.SpringBootMvcCrudProject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	@GetMapping("/")
public ModelAndView sayHello()
{
	String msg="hello welcome to spring boot";
	return new ModelAndView("hello","msg",msg);
}
}
