<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Product Selection</title>
</head>
<body style="font-family: Arial, sans-serif; text-align: center; background-color: #f8f9fa; padding: 20px;">

    <form action="addtocart" style="display: inline-block; padding: 20px; background: #fff; border-radius: 10px; box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);">
        <h2 style="color: #333;">Select Products</h2>

        <c:forEach var="p" items="${plist}">
            <div style="margin-bottom: 10px;">
                <input type="checkbox" name="products" id="${p.pid}" value="${p.pid}">
                <label for="${p.pid}" style="font-size: 16px; color: #555;">${p.pname}</label>
            </div>
        </c:forEach>

        <button type="submit" name="btn" id="cart" value="cart" 
            style="margin-top: 15px; padding: 10px 20px; font-size: 16px; background-color: #28a745; color: white; border: none; border-radius: 5px; cursor: pointer;">
            Add to Cart
        </button>
    </form>

</body>
</html>
