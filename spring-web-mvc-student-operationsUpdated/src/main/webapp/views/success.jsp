<%@ page import="com.model.Student"%>
<%@ page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Success Page</title>
</head>
<body>
	<h1>Success Page</h1>

	<%
		List<Student> sList = (List<Student>) request.getAttribute("data");
	%>

	<h1>Students List</h1>
	<table border=1 cellspadding=10 cellspacing=0>
		<tr>
			<th>Roll No</th>
			<th>Name</th>
			<th>Mobile NO</th>
			<th>Email Id</th>
			<th>City</th>
		</tr>

		<%
			for (Student stu : sList) {
		%>
		<tr>
			<td><%=stu.getRno()%></td>
			<td><%=stu.getName()%></td>
			<td><%=stu.getMobileNo()%></td>
			<td><%=stu.getEmail()%></td>
			<td><%=stu.getCity()%></td>
		</tr>
		<%
			}
		%>
	</table>
</body>
</html>