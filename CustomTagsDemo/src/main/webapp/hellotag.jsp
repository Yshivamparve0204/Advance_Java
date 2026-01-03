<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="mytag" uri="/mycustomtags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
  int n1=30;
int n2=50;
%>

<h1>Welcome to custom tag</h1>
<mytag:calculate num1="<%=n1%>" num2="<%=n2%>"></mytag:calculate>
<mytag:hello fname="Tejas" lname="Bhavsar"></mytag:hello>
</body>
</html>