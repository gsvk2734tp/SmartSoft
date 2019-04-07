<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html lang="en">
<jsp:include page="headTag.jsp"/>
<link href="<c:url value="/resources/css/diagram.css" />" rel="stylesheet">

<body>
<div class="table-title">
    <h3 class="text-center">Most popular forms</h3>
</div>
<form action="${pageContext.request.contextPath}/mainPage">
    <button class="cancelB">Home page</button>
</form>
<table class="table-fill">
    <c:if test="${empty topform}">
        <h2 class="text-center error">The report is empty. Try downloading another file.</h2>
    </c:if>
    <c:if test="${not empty topform}">
        <thead>
        <tr>
            <th class="text-left">Url form</th>
            <th class="text-left">Hop count</th>
        </tr>
        </thead>
        <tbody class="table-hover">
        <c:forEach items="${topform}" var="entry">
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