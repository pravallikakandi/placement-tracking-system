<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Dept Admin Login Page </title>
</head>
<body style="background-color:powderblue;">
<h3 align=center><u>Login</u></h3>
<center>
<form method="post" action="checkdadmin">
Username <input type="text" name="dname" required><br>
Password <input type="password" name="dpwd" required><br>
<input type="submit" value="Login">
</form>
</center>
</body>
</html>