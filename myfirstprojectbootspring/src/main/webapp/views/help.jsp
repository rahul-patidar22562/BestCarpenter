<%@page import="java.time.LocalDateTime"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/xml" prefix="x"%>
<%@page isELIgnored="false"%>


<!DOCTYPE html>
<html>

<head>
<meta charset="ISO-8859-1">
<title>Help Page</title>
</head>
<body>
<jsp:include page="header.jsp" />
	<%
		/* String name = (String) request.getAttribute("name");
Integer rollnumber = (Integer) request.getAttribute("rollnumber");
LocalDateTime time=(LocalDateTime)request.getAttribute("time"); */
	%>

	<h1>
		Hello My name is
		<%-- <%= name %> --%>
		${name}
	</h1>

	<h1>This is help page</h1>
	<h1>
		my rollnumber is
		<%-- <%=rollnumber%> --%>
		${rollnumber }
	</h1>
	<h1>
		Date And Time is
		<%-- <%= time.toString() %> --%>

		${time}
	</h1>
	<hr>
     <br/>
     <br/>
	<h1>${marks}</h1>
	<c:forEach var="item" items="${marks}">
		 <h1>Mark= ${item}</h1> 		
		<h1><c:out value="item"></c:out></h1>
	</c:forEach>

<jsp:include page="footer.jsp" />
</body>
</html>
