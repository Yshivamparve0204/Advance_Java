package com.demo.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/currencycon",
					        initParams = {
					                @WebInitParam(name = "drate", value = "85.17"),
					                @WebInitParam(name = "erate", value = "96.83"),
					                @WebInitParam(name = "prate", value = "115.16")
					        })
public class CurrencyConverterServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private float drate, erate, prate;

    public void init(ServletConfig config) throws ServletException {
        drate = Float.parseFloat(config.getInitParameter("drate"));
        erate = Float.parseFloat(config.getInitParameter("erate"));
        prate = Float.parseFloat(config.getInitParameter("prate"));
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        try {
            double amt = Double.parseDouble(request.getParameter("amt"));
            String curr = request.getParameter("curr");

            if (amt < 0) {
                out.println("<h3 style='color:red;'>Error: Negative values are not allowed!</h3>");
                out.println("<a href='currency.html'>Go back</a>");
                return;
            }

            double fmt = 0;
            switch (curr) {
                case "dollar":
                    fmt = amt / drate;
                    break;
                case "euro":
                    fmt = amt / erate;
                    break;
                case "pound":
                    fmt = amt / prate;
                    break;
                default:
                    out.println("<h3 style='color:red;'>Error: Invalid currency type!</h3>");
                    out.println("<a href='currency.html'>Go back</a>");
                    return;
            }

            out.println("<h1>Amount: " + amt + "</h1>");
            out.println("<h1>Converted to: " + curr + "</h1>");
            out.println("<h1>Converted Amount: " + fmt + "</h1>");
            out.println("<a href='currency.html'>To convert more, click here</a>");

        } catch (NumberFormatException e) {
            out.println("<h3 style='color:red;'>Error: Please enter a valid numeric amount!</h3>");
            out.println("<a href='currency.html'>Go back</a>");
        }
    }
}
