<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="ISO-8859-1">
    <title>Order Confirmation</title>
</head>
<body style="font-family: Arial, sans-serif; text-align: center; margin: 50px; padding: 20px; background-color: #f8f9fa;">
    <div style="padding: 30px; border-radius: 10px; background: #fff; box-shadow: 0 0 10px rgba(0, 0, 0, 0.1); display: inline-block;">
        <h2 style="color: #28a745;">Thank You for Placing Your Order!</h2>
        <h3 style="color: #333;">Your order will be processed shortly and delivered within 5 days.</h3>
    </div>
    <% session.invalidate(); %>
</body>
</html>
