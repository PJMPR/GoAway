<%@page import="java.util.List"%>
<%@page import="domain.model.Client"%>
<%@page import="domain.model.Tour"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	    Client client = (Client) session.getAttribute("client");
	    List<Tour> tours = (List) session.getAttribute("tours");
	%>
	<h1>Name: <%=client.getName() %></h1>
	<h1>Surname: <%=client.getSurname() %></h1>
	<h1>Tours:</h1>
	<ol>
		<%for(Tour tour: tours){ %>
			<li><%=tour.getAsset() %> <%=tour.getCountry() %></li>
		<%} %>
	</ol>
	<form action="DbServlet" method="get">
	<input type="submit" value="Wyślij">
	</form>
</body>
</html>