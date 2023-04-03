<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Future RedHats</title>
</head>
<body style="background-color:powderblue;">
<h2 align=center><u>Placement Tracking And Activity Management System</u></h2><hr color=green><hr color=green><br>
<a href="home.jsp">Home</a>&nbsp;&nbsp;&nbsp;
<a href="aboutus.jsp">About Project</a>&nbsp;&nbsp;&nbsp;
<a href="irpadmin.jsp">IRP Admin</a>&nbsp;&nbsp;&nbsp;
<a href="deptadmin.jsp">Department Admin</a>&nbsp;&nbsp;&nbsp;
<a href="recruiter.jsp">Recruiter</a>&nbsp;&nbsp;&nbsp;
<a href="Student.jsp">Student</a>&nbsp;&nbsp;&nbsp;

<br><br>
<h3 align=center><u>Login</u></h3>
<center>
<form method="post" action="checkuser">
Username <input type="text" name="uname" required><br>
Password <input type="password" name="pwd" required><br>
<input type="submit" value="Login">
</form>
</center>
</body>
</html>