package com.demo.servlets;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.demo.service.*;
import com.demo.model.MyUser;

public class ForgotPassword extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String email = request.getParameter("email");

        UserService uservice = new UserServiceImpl();
        MyUser u = uservice.findQuestion(email);

        out.println("<html><head>");
        out.println("<style>");
        out.println("body {  background-image: url(\"antelope-6908215_1281.jpg\"); background-position: center; background-size: cover;  background-size: 100% 100%;font-family: Arial, sans-serif; display: flex; justify-content: center; align-items: center; height: 100vh; background-color: #f4f4f4; }");
        out.println("form { background: #7f9bb2; padding: 20px; border-radius: 5px; box-shadow: 0px 0px 10px rgba(0,0,0,0.1); width: 350px; text-align: left; }");
        out.println("label { font-weight: bold; display: block; margin-top: 10px; }");
        out.println("input { width: 100%; padding: 8px; margin-top: 5px; border: 1px solid #ccc; border-radius: 4px; }");
        out.println("button { width: 100%; margin-top: 15px; padding: 10px; background-color: #007bff; color: white; border: none; cursor: pointer; border-radius: 4px; }");
        out.println("button:hover { background-color: #0056b3; }");
        out.println("</style>");
        out.println("</head><body>");

        out.println("<form action='changepassword' method='post'>");
        out.println("<h2 style='text-align: center;'>Reset Password</h2>");
        out.println("<label>Question:</label><input type='text' name='que' value='" + u.getQue() + "' readonly/>");
        out.println("<label>Answer:</label><input type='text' name='ans'>");
        out.println("<input type='hidden' name='myans' value='" + u.getAns() + "'>");
        out.println("<input type='hidden' name='email' value='" + u.getEmail() + "'>");
        out.println("<label>New Password:</label><input type='password' name='npass'>");
        out.println("<label>Retype Password:</label><input type='password' name='cpass'>");
        out.println("<button type='submit'>Submit</button>");
        out.println("</form>");

        out.println("</body></html>");
    }
}
