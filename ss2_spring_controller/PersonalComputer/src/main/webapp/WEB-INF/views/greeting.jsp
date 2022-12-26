<%--
  Created by IntelliJ IDEA.
  User: macbookair
  Date: 19/12/2022
  Time: 18:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form method="get" action="/calculate">
        <input type="number" name="nb1" />
        <input type="number" name="nb2" />
        <select name="dau">
            <option value="+">+</option>
            <option value="-">-</option>
            <option value="*">*</option>
            <option value="/">/</option>
        </select>
        <input type="submit" value="tinh">
    </form>
    <c:if test="${result != 0}">
        <p >Result: ${result}</p>
    </c:if>
</body>
</html>
