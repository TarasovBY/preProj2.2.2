<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Страница с машинами</title>
</head>
<body>
<c:set var="locale" value="${loc}"/>

<table border="3">
    <tbody>
    <tr>
        <td colspan="3"><strong><p align="center">${locale}</p></strong></td>
    </tr>
    <tr>
        <td><strong>Brand</strong></td>
        <td><strong>Model</strong></td>
        <td><strong>Price</strong></td>
    </tr>
    <c:forEach var="car" items="${cars}">
        <tr>
            <td>${car.brand}</td>
            <td>${car.model}</td>
            <td>${car.price}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
