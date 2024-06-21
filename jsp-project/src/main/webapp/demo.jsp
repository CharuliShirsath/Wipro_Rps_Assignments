<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"  import="java.time.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Sample Java Server Page</title>
</head>
<body>
	<%@ include file="header.jsp" %>
	<h3>Hello, Today's date is</h3>
	
	<!--
		Java code is placed within a scriptlet.
		
		what is out? out is an implicit object i.e JSP provides PrintWriter object called out by default.
		There are 9 implicit objects which we can use in JSP.
				
				out, request, response,  config,  session,   application, exception, page, pageContext
				
				
				In the above, config is nothing but ServletConfig object
				application is ServletContext object
	 -->
	<% 
	
		LocalDateTime  today = LocalDateTime.now();
		out.println(today);
		request.setAttribute("email","charulishirsath@gmail.com");
		
	
	%>
	
	<h3>My Email Id  is: </h3>
	<%
		out.println(request.getAttribute("email")) ;
	%>
	
	<%@ include file="footer.jsp" %>
</body>
</html>

