<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html lang="en">
<jsp:include page="headTag.jsp"/>
<link href="<c:url value="/resources/css/diagram.css" />" rel="stylesheet">

<body>
<div class="table-title">
    <h3>User activity in the last hour</h3>
</div>
<form action="${pageContext.request.contextPath}/mainPage">
    <button class="cancelB">Home page</button>
</form>
<table class="table-fill">
    <c:if test="${empty hourform}">
    <h2 class="text-center" style="background-color: #f44336">The report is empty. Try downloading another file.</h2>
    </c:if>
    <c:if test="${not empty hourform}">
    <thead>
    <tr>
        <th class="text-left">User Id</th>
        <th class="text-left">URL active forms</th>
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
    </c:if>
</table>
<div class="loaderArea">
    <div class="loader"></div>
</div>
</body>