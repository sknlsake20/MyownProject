<%@ page language="java" import="java.sql.*" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
body{
background-color:lightblue;
}
</style>
</head>
<body>
<%
String f=request.getParameter("fname");
String l=request.getParameter("lname");
String u=request.getParameter("uname");
String p=request.getParameter("pwd");
try {
	Class.forName("com.mysql.cj.jdbc.Driver");
	String url="jdbc:mysql://localhost:3306/Personaldb";
	String username="root";
	String password="root";
	Connection con=DriverManager.getConnection(url, username, password);
	String query="insert into UserDatabase values(?,?,?,?)";
	PreparedStatement ps=con.prepareStatement(query);
	ps.setString(1, f);
	ps.setString(2, l);
	ps.setString(3, u);
	ps.setString(4, p);
	int i=ps.executeUpdate();
	if(i>0)
	{
		out.println("successfull insertion");
		
	}
	else {
		out.println("Invalid username and password");
		
	}

} catch (ClassNotFoundException | SQLException e1) {
	// TODO Auto-generated catch block
	e1.printStackTrace();
	}

%>
</body>
</html>