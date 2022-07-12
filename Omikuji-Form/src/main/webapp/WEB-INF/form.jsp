<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>Send an Omikuji!</h1>
<form action="/omikuji" method="POST">
	<label for="number">Pick any number from 5 to 8: </label><br>
	<select id="" name="number">
	  <option value="five">5</option>
	  <option value="six">6</option>
	  <option value="seven">7</option>
	  <option value="eight">8</option>
	</select><br>
  <label for="city">Enter the name of any city:</label><br>
  <input type="text" id="" name="city" ><br>
  <label for="name">Name:</label><br>
  <input type="text" id="" name="name" ><br><br>
   <label for="hobby">Enter professional endeavor or hobby:</label><br>
  <input type="text" id="" name="hobby" ><br><br>
   <label for="thing">Enter any type of living thing:</label><br>
  <input type="text" id="" name="thing" ><br><br>
  <textarea name="message" rows="10" cols="30" placeholder="Say something nice"></textarea>
  <input type="submit" value="Submit">
</form> 

</body>
</html>