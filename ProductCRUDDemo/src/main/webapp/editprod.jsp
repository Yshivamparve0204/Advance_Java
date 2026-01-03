<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="com.demo.model.Manufacture"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
	Manufacture m=(Manufacture)request.getAttribute("manufacture");
%>


<form action="updateprod" method="post">
	Product Id:<input type="text" name="pid" value="<%=m.getId()%>"readonly> <br><br>
	Product_Name:<input type="text" name="pname" value="<%=m.getProduct_name()%>"><br><br>
	Quantity:<input type="text" name="qty" value="<%=m.getQuantity()%>"><br><br>
	Production_Date:<input type="date" name="pdt" value="<%=m.getProduction_date()%>"><br><br>
	Factory_Location:<input type="text" name="loc" value="<%=m.getFactory_location()%>"><br><br>
	Status:<input type="text" name="status" value="<%=m.getStatus()%>"><br><br>
	Price:<input type="text" name="price" value="<%=m.getPrice()%>"><br><br>
	<button type="submit" value="btn">Update</button>
</form>
</body>
</html>