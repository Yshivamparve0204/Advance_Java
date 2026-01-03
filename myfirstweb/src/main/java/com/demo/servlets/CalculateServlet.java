package com.demo.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CalculateServlet extends HttpServlet{

	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		int n1=Integer.parseInt(request.getParameter("num1"));
        int n2=Integer.parseInt(request.getParameter("num2"));
        int n3=Integer.parseInt(request.getParameter("num3"));
        int add=n1+n2+n3;
        out.println("<h1> addition is :"+add+"</h1>");
        
		
		
	}
}
