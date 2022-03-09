<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action = "adduser">
<h1>Enter user data</h1>
Enter Id<input type = "text" name = "id"><br>
Enter Name<input type = "text" name = "name"><br>
<input type ="submit">
</form>


<form action = "getuser">
<h2>Display user data</h2>
Enter Id<input type = "text" name = "id"><br>

<input type ="submit">
</form>

<form action = "deleteuser">
<h2>Delete user data</h2>
Enter Id<input type = "text" name = "id"><br>

<input type ="submit">
</form>

<form action = "updateuser">
<h2>Enter the details for updation :</h2>
Enter Id<input type = "text" name = "id"><br>

<input type ="submit">
</form>
</body>
</html>