<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html lang="en">
<jsp:include page="headTag.jsp"/>
<link href="<c:url value="/resources/css/diagram.css" />" rel="stylesheet">

<body>
<div class="table-title">
    <h3 class="text-center">Самые популярные формы</h3>
</div>
<table class="table-fill">
    <c:if test="${empty topform}">
        <h2 class="text-center error">Отчет пуст. Попробуйте загрузить другой файл.</h2>
    </c:if>
    <c:if test="${not empty topform}">
        <thead>
        <tr>
            <th class="text-left">Url формы</th>
            <th class="text-left">Количество переходов</th>
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