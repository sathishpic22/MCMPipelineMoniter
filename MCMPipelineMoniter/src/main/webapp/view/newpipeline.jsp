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
<h1>New Pipeline</h1>
<form action="newenquiry" method="post">
 <input type="text" name="pipelineid" placeholder="PipelineId" required><br><br>
 <input type="text" name="customername" placeholder="Customer Name" required> <br><br>
 <input type="text" name="dateofenquiry" placeholder="Enter Dateof Enquiry"
                    onfocus="(this.type='date')"> <br><br>
<input type="text" name="lastfollowed" placeholder="Enter LastFollowed Date"
                    onfocus="(this.type='date')"><br><br>
 <input type="text" name="nextfollowdate" placeholder="Enter Nextfollow Date"
                    onfocus="(this.type='date')"><br><br>
<input type="text" name="channel" placeholder="Enter Channel details" required>
<br><br>
<input type="text" name="status" placeholder="Enter Pipeline Status" required>
 <br><br>
 <input type="number" name="ordervalue" placeholder="Order Value" required> <br><br>
 <input type="text" name="location" placeholder="Location" required> <br><br>
  <input type="number" name="phone" placeholder="Enter Phone Number" required> <br><br>
 <input type="text" placeholder="Insta Id" name="instaid"> <br><br>
<input type="email" name="email" placeholder="Email Address" required>   <br><br>
<input type="text" name="ordertype" placeholder="Order type" required>  <br><br><br>
<input type="submit" Value="Submit">

</form>
<p>${success}</p>
</body>
</html>