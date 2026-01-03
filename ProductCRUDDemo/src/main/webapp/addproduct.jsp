<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="addproduct" method="post"><br><br>
Product Id: <input type="text" id="id" name="id"><br><br>
Product_Name: <input type="text" id="pname" name="pname"><br><br>
Quantity: <input type="text" id="qty" name="qty"><br><br>
Production_Date: <input type="date" id="dt" name="dt"><br><br>
Factory_Location: <input type="text" id="loc" name="loc"><br><br>
Status:
<select name="status" id="status">
<option value="pending">Pending</option>
<option value="in progress">In Progress</option>
<option value="completed">Completed </option>
</select><br><br>
Price: <input type="text" id="price" name="price"><br><br>
<button type="submit" name="btn" id="btn">Add New Product</button>
</form>
</body>
</html>