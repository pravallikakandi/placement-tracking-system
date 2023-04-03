<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>IRP Admin Login Page </title>
</head>
<body style="background-color:powderblue;">
<h3 align=center><u>Login</u></h3>
<center>
<form method="post" action="checkirpadmin">
Username <input type="text" name="iname" required><br>
Password <input type="password" name="ipwd" required><br>
<input type="submit" value="Login">
</form>
</center>
</body>
</html>