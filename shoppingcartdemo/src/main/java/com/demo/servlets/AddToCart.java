package com.demo.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import com.demo.model.*;
import com.demo.service.*;

import java.util.ArrayList;
import java.util.List;


@WebServlet("/addtocart")
public class AddToCart extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    String btn=request.getParameter("btn");
	    HttpSession session=request.getSession();
	    List<Product> cart=(List<Product>)session.getAttribute("cart");
	    switch(btn) {
	    case "cart":
			    String[] parr=request.getParameterValues("products");
			    ProductService pservice=new ProductServiceImpl();
			    List<Product> plist=pservice.findAllProduct(parr);
			    
			    if(cart==null) {
			    	cart=new ArrayList<>(plist);
			    }else {
			    	for (Product p:plist) {
			    		cart.add(p);
					}
			    }
			    session.setAttribute("cart", cart);
			  
			    RequestDispatcher rd=request.getRequestDispatcher("displaycategory");
			    rd.forward(request, response);
	            break;
	    
	    }
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
