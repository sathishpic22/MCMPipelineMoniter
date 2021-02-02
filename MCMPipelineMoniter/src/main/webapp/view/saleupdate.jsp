<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Sales Update</h1>
<form action="saleupdate" method="post">
<input type="text" name="pipelineid" placeholder="PipelineId" required><br><br>
 <input type="text" name="saledate" placeholder="Enter Sale Date"
                    onfocus="(this.type='date')"><br><br>
 <input type="text" name="paymentmode" placeholder="Enter Payment Mode" required><br><br>
 <input type="submit" Value="Submit">
</form>
<P>${Success}</P>
<P>${ErrorMessage}</P>
</body>
</html>