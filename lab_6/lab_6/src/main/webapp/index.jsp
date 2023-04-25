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
    <label for="login">LOGIN:</label>
    <input type="text" id="login" name="login">
    <br><br>
    <input type="submit" value="ВОЙТИ">
</form>
</body>
</html>