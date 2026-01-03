package com.demo.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.demo.service.UserService;
import com.demo.service.UserServiceImpl;
import com.demo.model.User;

@WebServlet("/login")
public class LoginForm extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		UserService uservice=new UserServiceImpl();
		String uname=request.getParameter("uname");
		String  pass=request.getParameter("pass");
		User u=uservice.validateUser(uname,pass);
		if(u!=null) {
			HttpSession session=request.getSession();
			session.setAttribute("user", u);
			RequestDispatcher rd=request.getRequestDispatcher("displayServlet");
			rd.forward(request, response);
		}else {
			out.println("<h1>Wrong Credentials<h1>");
			RequestDispatcher rd=request.getRequestDispatcher("login.jsp");
			rd.include(request, response);
		}
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(req, resp);
	}

}
