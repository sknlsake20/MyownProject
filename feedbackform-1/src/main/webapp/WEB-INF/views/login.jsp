<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="<c:url value="/resources/css/index.css" />"
 rel="stylessheet">
</head>
<body>
<center>
<h1>Welcome to Teacher Feedback Management System</h1><b>
<form action="/login">
Enter Username: <input type="text" name="uname"/><br/>
Enter password: <input type="password" name="pwd"/><br/>
<input type="submit" value="Login"/><br/>
New User: <a href="/student/list">Click here</a></b>
</form>
</center>
</body>
</html>