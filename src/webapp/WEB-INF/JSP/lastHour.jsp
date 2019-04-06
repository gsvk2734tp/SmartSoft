<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html lang="en">
<jsp:include page="headTag.jsp"/>
<link href="<c:url value="/resources/css/diagram.css" />" rel="stylesheet">

<body>
<div class="table-title">
    <h3>Активность пользователей за последний час</h3>
</div>
<table class="table-fill">
    <thead>
    <tr>
        <th class="text-left">Id пользователя</th>
        <th class="text-left">URL активных форм<</th>
    </tr>
    </thead>
    <tbody class="table-hover">
    <c:forEach items="${hourform}" var="entry">
        <tr>
            <td class="text-left">${entry.key}</td>
            <td class="text-left">${entry.value}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>
<div class="loaderArea">
    <div class="loader"></div>
</div>
</body>