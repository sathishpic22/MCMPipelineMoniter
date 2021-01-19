<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>New Pipeline</h1>
<form action="newpipeline" method="post">

PipelineId : <input type="text" name="pipelineid"><br>
DateOfEnquiry : <input type="text" name="dateofenquiry"><br>
CustomerName : <input type="text" name="customername"> <br>
Channel : <select name="channel" id="channelname"><br>
  <option value="955WA">955WA</option>
  <option value="804WA">804WA</option>
  <option value="861WA">861WA</option>
  <option value="Call">Call</option>
  <option value="Instagram">Instagram</option>
  <option value="Facebook">Facebook</option>
  <option value="Website">Website</option>
  <option value="InPerson">InPerson</option>
  <option value="Email">Email</option>
</select> 
<br>
Status : <select name="status" id="status">
  <option value="Photo Review">Photo Review</option>
  <option value="Interested">Interested</option>
  <option value="Waiting For Payment">Waiting For Payment</option>
  <option value="Paid Partial">Paid Partial</option>
  <option value="Paid Full">Paid Full</option>
  <option value="InHold">InHold</option>
  <option value="Dropped">Dropped</option>
</select> <br>
LastFollowed : <input type="text" name="lastfollowed"> <br>
OrderValue : <input type="text" name="ordervalue"> <br>
Location : <input type="text" name="location"> <br>
Phone Number:  <input type="text" name="phone"> <br>
InstagramId : <input type="text" name="instaid"> <br>
Email:<input type="text" name="email">   <br>
OrderType : <input type="text" name="ordertype">  <br><br>

<input type="submit" Value="Submit">
</form>
</body>
</html>