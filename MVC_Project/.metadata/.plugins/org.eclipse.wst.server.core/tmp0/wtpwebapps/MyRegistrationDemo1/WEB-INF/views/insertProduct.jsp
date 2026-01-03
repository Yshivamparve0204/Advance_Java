<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="insertProduct" method="post"><br/>
Product Id:=<input type="text" name="pid" value="pid"/><br/>
Product Name:=<input type="text" name="pname" value="pname"/><br/>
Product Qty:=<input type="text" name="qty" value="qty"/><br/>
Product Price:=<input type="text" name="price" value="price"/><br/>
Product Mfgdate:=<input type="date" name="mfgdate" value="mfgdate"/><br/>
Product Id:=<input type="text" name="cid" value="cid"/><br/>
<button type="submit" name="btn" id="insert">Add New Product</button><br/>
</form>
</body>
</html>