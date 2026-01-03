package com.demo.servlets;

import com.demo.model.*;
import com.demo.service.UserService;
import com.demo.service.UserServiceImpl;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegisterServlet extends HttpServlet{
		public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException {
			response.setContentType("text/html");
			PrintWriter out=response.getWriter();
			String name=request.getParameter("name");
			String gender=request.getParameter("gender");
			String[] skill=request.getParameterValues("skill");
			String question=request.getParameter("que");
			String answer=request.getParameter("ans");
			String email=request.getParameter("email");
			String password=request.getParameter("pass");
			UserService uservice =new UserServiceImpl();
			MyUser u=new MyUser(name,gender,skill,question,answer,email,password);
			uservice.registerUser(u);
			RequestDispatcher rd=request.getRequestDispatcher("login.html");
			rd.forward(request,response);
		}
}
