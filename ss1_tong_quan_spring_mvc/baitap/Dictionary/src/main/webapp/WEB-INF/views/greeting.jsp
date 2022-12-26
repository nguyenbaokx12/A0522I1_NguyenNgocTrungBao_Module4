<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Greeting</title>
</head>
<body>
<form action="/calculator/name" method="get">
    <input type="text" name="search"/>
    <input type="submit" value="search">
</form>
<c:if test="${result != null}">
    <p >Result: ${result}</p>
</c:if>
<c:if test="${result == null}">
    <p >Not found</p>
</c:if>
</body>
</html>