<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Result</title>
</head>
<body>
<%
	/*
	String name = (String)session.getAttribute("NAME");
	String usn = (String)session.getAttribute("USN");
	int m1 = (int)session.getAttribute("marks1");
	int m2 = (int)session.getAttribute("marks2");
	int m3 = (int)session.getAttribute("marks3");
	
	out.println(name);
	out.println(usn);
	out.println(m1);
	out.println(m2);
	out.println(m3);
	*/
	out.println((String)session.getAttribute("NAME"));
	out.println((String)session.getAttribute("USN"));
	out.println((int)session.getAttribute("marks1"));
	out.println((int)session.getAttribute("marks2"));
	out.println((int)session.getAttribute("marks3"));

%>

</body>
</html>