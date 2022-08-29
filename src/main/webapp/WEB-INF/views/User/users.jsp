<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>View Users</title>
    <link href="<c:url value="/css/main.css"/>" rel="stylesheet" type="text/css">
</head>
<body>
<h1>Users</h1>
<br><br>
<td><a href="/User/add">Add User</a></td>
<br><br>
<table>
    <thead>
    <tr>
        <th>First Name</th>
        <th>Last Name</th>
        <th>Nickname</th>
        <th>Admin privilege</th>
        <th>Password</th>

    </tr>
    </thead>
    <tbody>

    <jsp:useBean id="users" scope="request" type="java.util.List"/>
    <c:forEach items="${users}" var="user">
        <tr>
            <td>${user.firstName}</td>
            <td>${user.lastName}</td>
            <td>${user.nickname}</td>
            <td>${user.adminPrivilege}</td>
            <td>${user.password}</td>

        </tr>
    </c:forEach>
    </tbody>
</table>
<br><br>
<td><a href="/">Back</a></td>
</body>
</html>