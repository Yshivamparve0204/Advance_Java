<%@page import="java.time.format.DateTimeFormatter"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.List,com.demo.model.Manufacture"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%List<Manufacture> mlist=(List<Manufacture>)request.getAttribute("mlist");%>
<table border="3">
<tr>
<th>Id</th>
<th>Product_Name</th>
<th>Quantity</th>
<th>Production_Date</th>
<th>Factory_Location</th>
<th>Status</th>
<th>Price</th>
 <th>Product Actions</th>
</tr>
<% for(Manufacture m:mlist){
	String dt="";
	if(m.getProduction_date()!=null)
		dt=m.getProduction_date().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
	%>
	<tr>
      <td><%=m.getId() %></td>
      <td><%=m.getProduct_name() %></td>
      <td><%=m.getQuantity()%></td>
        <td><%=m.getProduction_date() %></td>
          <td><%=m.getFactory_location() %></td>
            <td><%=m.getStatus()%></td>
              <td><%=m.getPrice()%></td>
              <td><a href="delete?id=<%=m.getId()%>">delete</a>
              <a href="edit?id=<%=m.getId()%>">edit</a></td>
  </tr>
<% }%>
</table>
<a href="addproduct.jsp">Add New Product</a>
<a href="logout">logout</a>
</body>
</html>