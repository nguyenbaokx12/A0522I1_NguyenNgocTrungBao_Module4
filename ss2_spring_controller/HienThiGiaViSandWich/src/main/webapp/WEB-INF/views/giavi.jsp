<%--
  Created by IntelliJ IDEA.
  User: TechCare
  Date: 10/17/2022
  Time: 8:25 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Sandwich Condiments</h1>
<form action="/bai1" method="post">
    <input type="checkbox" id="vehicle1" name="Lettuce" value="Lettuce">
    <label for="vehicle1">Lettuce</label><br>
    <input type="checkbox" id="vehicle2" name="Tomato" value="Tomato">
    <label for="vehicle2">Tomato</label><br>
    <input type="checkbox" id="vehicle3" name="Mustard" value="Mustard">
    <label for="vehicle3">Mustard</label><br>
    <input type="checkbox" id="vehicle4" name="Sprouts" value="Sprouts">
    <label for="vehicle4">Sprouts</label><br>
    <hr style="width: 320px; float: left">
    <br>
    <input type="submit" value="save">
</form>
</body>
</html>