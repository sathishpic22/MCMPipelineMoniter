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
<h1>Last Follow Date Update</h1>
<form action="lastfollowdateform" method="post">
 <input type="text" name="pipelineid" placeholder=" Enter Valid PipelineId" required><br><br>
 <input type="text" name="lastfollowed" placeholder="Enter LastFollowed Date"
                    onfocus="(this.type='date')"><br><br>
 <input type="text" name="nextfollowdate" placeholder="Enter Nextfollow Date"
                    onfocus="(this.type='date')"><br><br>
 <input type="submit" Value="Submit">
</form>
<P>${Success}</P>
<P>${ErrorMessage}</P>
 
</body>
</html>