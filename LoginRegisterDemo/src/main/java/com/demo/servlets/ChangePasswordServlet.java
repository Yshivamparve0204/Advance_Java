package com.demo.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.demo.service.UserService;
import com.demo.service.UserServiceImpl;

public class ChangePasswordServlet extends HttpServlet{
		public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException {
			response.setContentType("text/html");
			PrintWriter out=response.getWriter();
			String myans=request.getParameter("myans");
			String ans=request.getParameter("ans");
			if(myans.equals(ans))
			{
				UserService u=new UserServiceImpl();
				String newpass=request.getParameter("npass");
				String email=request.getParameter("email");
				String changepass=request.getParameter("cpass");
				boolean status=u.modifyPassword(email,newpass,changepass);
				
				if(status)
				{
					out.println("<h1>password changed successfully!</h1>");               
				}     
				else {
					out.println("<h3>new password and change password must be same<h3>");
				}
				
			}
			else {
				out.println("<h1>you are not authorized user to change the password<h1>");
			}
			RequestDispatcher rd=request.getRequestDispatcher("login.html");
			rd.include(request, response);
		}
}
