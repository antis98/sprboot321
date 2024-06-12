<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <c:if test="${empty user.firstName}">
        <title>Add</title>
    </c:if>
    <c:if test="${!empty user.firstName}">
        <title>Edit</title>
    </c:if>
</head>
<body>
<c:if test="${empty user.firstName}">
    <c:url value="/add" var="var"/>
</c:if>
<c:if test="${!empty user.firstName}">
    <c:url value="/edit" var="var"/>
</c:if>
<form action="${var}" method="POST">
    <c:if test="${!empty user.firstName}">
        <input type="hidden" name="id" value="${user.id}">
    </c:if>
    <label for="firstName">Name</label>
    <input type="text" name="firstName" id="firstName">
    <label for="lastName">LastName</label>
    <input type="text" name="lastName" id="lastName">
    <label for="year">Year</label>
    <input type="text" name="year" id="year">
    <label for="employer">Employer</label>
    <input type="text" name="employer" id="employer">
    <c:if test="${empty user.firstName}">
        <input type="submit" value="Add new user">
    </c:if>
    <c:if test="${!empty user.firstName}">
        <input type="submit" value="Edit user">
    </c:if>
</form>
</body>
</html>