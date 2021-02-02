<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
  
<!------ Include the above in your HEAD tag ---------->
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
  
<title>Insert title here</title>
</head>
<body>
<h1>Welcome Mycutemini Pipeline Login</h1>
<form action="login" method=post>
 <input type="text" name="username" placeholder="Enter Username" required><br><br>
 <input type="password" name="password" placeholder="Enter Password" required><br><br>
 <input type="submit" value="Submit">
<p>${errormessage}</p>
<p>${logoutmessage }</p>
</form>
</body>
</html>