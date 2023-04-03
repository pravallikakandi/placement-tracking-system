<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Registration Page</title>
</head>
<body style="background-color:powderblue;">
<h3 align=center><u>Registration</u></h3>
<center>
<form method="post" action="studentreg">
Username <input type="text" name="sname" required><br>
Password <input type="password" name="spwd" required><br>
Gender&nbsp;&nbsp;
Male<input type="radio" name="egender" value="male" required>
Female<input type="radio" name="egender" value="female" required><br>
Date of Birth <input type="date" name="sdob" required><br>
Address <input type="text" name="saddress" required><br>
Program<input type="text" name="sprogram" required><br>
Department&nbsp;&nbsp;
<select name="sdept" required>
<option value="">--Select--</option>
<option value="CSE">CSE</option>
<option value="ECE">ECE</option>
<option value="IT">IT</option>
</select>
<br>
Phone Number <input type="text" name="sphonenum" required><br>
<input type="submit" value="Register">
 </form>
</body>
</html>