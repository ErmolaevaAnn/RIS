<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>NewProcess</title>
</head>
<body>
<h1><%= "Program by Ermolaeva Ann" %>
</h1>
<form method="POST" action="/hello">
    <label for="LOGIN">Login:</label>
    <input type="login" name="login" id="login">
    <br>
    <label for="PASSWORD">Password:</label>
    <input type="password" name="password" id="password">
    <br>
    <input type="submit" value="Submit">
</form>



<br/>
<a href="hello-servlet">Hello Servlet</a>

</body>
</html>