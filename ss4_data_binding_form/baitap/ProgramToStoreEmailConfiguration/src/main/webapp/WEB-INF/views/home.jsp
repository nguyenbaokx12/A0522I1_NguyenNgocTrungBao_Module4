<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
<form:form action="save" method="post" modelAttribute="mail" cssStyle="width: 350px">
    <fieldset>
        <legend>Settings</legend>
        <table>
            <tr>
                <td><form:label path="language">Languages:</form:label></td>
                <td>
                    <form:select  path="language">
                        <form:option value="NONE"> --SELECT--</form:option>
                        <form:option value="English">English</form:option>
                        <form:option value="Vietnamese">Vietnamese</form:option>
                        <form:option value="Japanese">Japanese</form:option>
                        <form:option value="Chinese">Chinese</form:option>
                    </form:select>
                </td>
            </tr>
            <tr>
                <td><form:label path="pageSize">Page Size:</form:label></td>
                <td>Show <form:select  path="pageSize">
                    <form:option value="5">5</form:option>
                    <form:option value="10">10</form:option>
                    <form:option value="15">15</form:option>
                    <form:option value="25">25</form:option>
                    <form:option value="50">50</form:option>
                    <form:option value="100">100</form:option>
                </form:select>
                    emails per page
                </td>
            </tr>
            <tr>
                <td><form:label path="spams">Spams fillter</form:label></td>
                <td><form:checkbox path="spams" />Enables spams filter</td>
            </tr>
            <tr>
                <td><form:label path="signature">Spams fillter</form:label></td>
                <td><form:textarea path="signature" /></td>
            </tr>
            <tr>
                <td><form:button>Cancel</form:button></td>
                <td><form:button>Update</form:button></td>
            </tr>
        </table>
    </fieldset>
</form:form>
</body>
</html>