
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>View Counters</title>
    <link href="<c:url value="/css/main.css"/>" rel="stylesheet" type="text/css">
</head>
<body>
<table>
    <thead>
    <tr>
        <th>Period</th>
        <th>Entered Date</th>
        <th>Counter Number</th>
        <th>Counter Status</th>

    </tr>
    </thead>
    <tbody>

    <jsp:useBean id="counters" scope="request" type="java.util.List"/>
    <c:forEach items="${counters}" var="counter">
        <tr>
            <td>${counter.periodMonth}</td>
            <td>${counter.enterDate}</td>
            <td>${counter.counter_number}</td>
            <td>${counter.status}</td>

        </tr>
    </c:forEach>
    </tbody>
</table>
<td><a href="/">Back</a></td>
</body>
</html>
