<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action=login>
		<input type="checkbox" name=c7 value="Bonda">Bonda
		<input type="checkbox" name=c8 value="Baji">Baji
		<input type="checkbox" name=c9 value="Rice">Rice
		 <button type="submit" class="btn btn-primary btn-block btn-large">shop 2..</button>
       <input type="hidden" name="id" value="shopping"> 
       <input type="hidden" name="shopid" value="shop3">
	</form>
	
	<div class="login">
	</br></br></br></br></br></br></br></br></br></br></br></br></br></br>
	   <jsp:include page="logout.jsp"/></div>
</body>
</html>