<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>View Flats</title>
    <link href="<c:url value="/css/main.css"/>" rel="stylesheet" type="text/css">
</head>
<body>
<h1>Flats</h1>
<br><br>
<table>
    <thead>
    <tr>
        <th>Flat number</th>

    </tr>
    </thead>
    <tbody>

    <jsp:useBean id="flats" scope="request" type="java.util.List"/>
    <c:forEach items="${flats}" var="flat">
        <tr>
            <td>${flat.number}</td>

        </tr>
    </c:forEach>
    </tbody>
</table>
<br><br>
<td><a href="/">Back</a></td>
</body>
</html>