<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>

<body>
	<%!
	public int factorial(int n1)
	{
		int fact=1;
		for(int i=1;i<=n1;i++)
		{
			fact= fact*i;
		}
		return fact;
	}
	%>
	<%
	String btn=request.getParameter("btn");
	int n1=Integer.parseInt(request.getParameter("n1"));
	switch(btn){
	case "add":
		int n2=Integer.parseInt(request.getParameter("n2"));
		int add=n1+n2;
		%>
		<h1>Addition : <%=add %></h1>
		<% break;
		
	case "fact":
		if(n1>0){
		int fact=factorial(n1);
		%>
		<h1>Factorial : <%=fact  %></h1>
		
		<%
		}else{
			%>
			<h1>Factorial : Undefined </h1>
			
			<% 
		}
		break;
		
	}
		%>
</body>
</html>