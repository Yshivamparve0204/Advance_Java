package com.demo.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.demo.model.Product;
import com.demo.service.*;
@WebServlet("/findproduct")
public class FindProduct extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String btn=request.getParameter("btn");
		switch(btn) {
		case "find":
			int cid=Integer.parseInt(request.getParameter("cid"));
			ProductService pservice=new ProductServiceImpl();
			List<Product> plist=pservice.showAllProduct(cid);
			request.setAttribute("plist", plist);
			RequestDispatcher rd=request.getRequestDispatcher("displayproduct.jsp");
			rd.forward(request, response);
			break;
			
		case "order":
			rd=request.getRequestDispatcher("displaycart.jsp");
			rd.forward(request, response);
		}
	}

}
