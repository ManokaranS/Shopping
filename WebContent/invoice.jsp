<%@page import="javax.websocket.Session"%>
<%@page import="java.util.Enumeration"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
	Enumeration E=session.getAttributeNames();
	while(E.hasMoreElements())
	{
		
		String name=E.nextElement().toString();
		String value=session.getAttribute(name).toString();
		if(name.startsWith("c"))
		out.println(name+"\t"+value);
	}
	session.invalidate();
%>
<jsp:include page="logout.jsp"/></div>
</body>
</html>