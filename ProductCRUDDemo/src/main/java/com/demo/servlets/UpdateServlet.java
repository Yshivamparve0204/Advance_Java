package com.demo.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.demo.model.Manufacture;
import com.demo.service.ManufactureService;
import com.demo.service.ManufactureServiceImpl;


@WebServlet("/updateprod")
public class UpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		int id=Integer.parseInt(request.getParameter("pid"));
		String pname=request.getParameter("pname");
		int qty=Integer.parseInt(request.getParameter("qty"));
		String dt=request.getParameter("pdt");
		LocalDate ldt=LocalDate.parse(dt,DateTimeFormatter.ofPattern("yyyy-MM-dd"));
		String loc=request.getParameter("loc");
		String status=request.getParameter("status");
		Float price=Float.parseFloat(request.getParameter("price"));
		Manufacture m=new Manufacture(id,pname,qty,ldt,loc,status,price);
		ManufactureService mservice=new ManufactureServiceImpl();
		
		boolean status1=mservice.updateProduct(m);
		if(status1) {
			RequestDispatcher rd=request.getRequestDispatcher("displayServlet");
			rd.forward(request, response);
		}
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
