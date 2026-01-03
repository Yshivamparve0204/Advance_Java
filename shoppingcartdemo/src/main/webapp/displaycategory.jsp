<%@page import="java.io.PrintWriter"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Select Category</title>
</head>
<body style="font-family: Arial, sans-serif; background-color: #f5f5f5; text-align: center; padding: 20px;">
    <h1 style="color: #333; margin-bottom: 20px;">Select Category</h1>
    <form action="findproduct">
        <select name="cid" id="cid" style="padding: 10px; font-size: 16px; border-radius: 5px;">
            <c:forEach var="c" items="${clist}">
                <option value="${c.cid}">${c.cname}</option>
            </c:forEach>
        </select>
        
        <br><br>
        
        <button type="submit" name="btn" id="find" value="find" 
            style="padding: 10px 20px; background-color: #007bff; color: white; border: none; 
            border-radius: 5px; cursor: pointer;">
            Find Product
        </button>
        
        <button type="submit" name="btn" id="order" value="order" 
            style="padding: 10px 20px; background-color: #28a745; color: white; border: none; 
            border-radius: 5px; cursor: pointer; margin-left: 10px;">
            Place Order
        </button>
    </form>
</body>
</html>
