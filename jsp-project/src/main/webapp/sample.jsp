<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"  import="java.time.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%@ include file="header.jsp" %>
	<h1> Sample Java Server Page</h1>
	<%-- Declaration --%>
	<%!
		int counter=0;
	
		public void greeting(){
			System.out.println("Good Day, Now the time is: " + LocalTime.now());
		}
	%>
	
	<%-- Expression --%>
	<%= LocalDateTime.now()  %>s
	
	
	<%-- Scriptlet --%>
	<%
	
		out.println("I'm A JSP Page");
	%>
	
	<%@ include file="footer.jsp" %>
	
	
	
</body>
</html>