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

import com.demo.service.ManufactureService;
import com.demo.service.ManufactureServiceImpl;


@WebServlet("/logout")
public class LogoutServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		HttpSession session=request.getSession();
		PrintWriter out=response.getWriter();
		session.invalidate();
		out.println("Thank You For Visiting.................");
		RequestDispatcher rd=request.getRequestDispatcher("login.jsp");
		rd.include(request, response);
		ManufactureService mservice=new ManufactureServiceImpl();
		mservice.closeMyConnection();
	}

}
