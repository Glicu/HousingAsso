
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add User</title>
</head>
<body>
<c:if test="${addUserSuccess}">
    <div>Successfully added User with nickname: ${savedUser.nickname}</div>
</c:if>
<br>
<c:url var="adduser_url" value="/User/add"/>
<form:form action="${adduser_url}" method="post" modelAttribute="user">
    <form:label path="firstName">Name: </form:label> <form:input type="text" path="firstName"/>
    <form:label path="lastName">Surname: </form:label> <form:input type="text" path="lastName"/>
    <form:label path="nickname">Nickname: </form:label> <form:input path="nickname"/>
    <form:label path="password">Password: </form:label> <form:input path="password"/>
    Flat: <form:select path="flat">
    <form:option value="0" label="--- wybierz ---"/>
    <form:options items="${flats}" itemLabel="number" itemValue="id"/>
</form:select><br>
    <form:errors path="flat"/><br>
    <br>

    <input type="submit" value="submit"/>
</form:form>
<br><br>
<td><a href="/User/all">Back</a></td>
</body>
</html>