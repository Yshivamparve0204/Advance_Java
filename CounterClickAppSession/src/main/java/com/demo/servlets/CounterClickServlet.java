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

@WebServlet("/counterservlet")
public class CounterClickServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
       
        HttpSession session = request.getSession(true);
        System.out.println("Session ID: " + session.getId() + " ---> " + session.isNew());

    
        Integer cnt = (Integer) session.getAttribute("cnt");
        if (cnt == null) {
            cnt = 1; 
        } else {
            cnt++; 
        }
        
        session.setAttribute("cnt", cnt); 
        session.setMaxInactiveInterval(2);
        out.println("<h1>You clicked " + cnt + " times</h1>");
        RequestDispatcher rd = request.getRequestDispatcher("counterclick.html");
        rd.include(request, response);
    }
}
