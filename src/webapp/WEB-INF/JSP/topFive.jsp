<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <meta charset="utf-8">
    <title>Top 5 form</title>
    <script src="https://www.google.com/jsapi"></script>
</head>

<body>
<div id="air" style="width: 500px; height: 400px;"></div>
<div>
    <c:forEach items="${map}" var="entry">
        Key = ${entry.key}, value = ${entry.value}<br>
        <h1>${entry.key} ${entry.value}</h1>
    </c:forEach>
</div>

<html>
<head>
    <title>Испытание: статистика браузеров</title>
    <meta charset="utf-8">
</head>
<body>
<main>
    <section>
        <h1>ID Самых посещаемых форм</h1>
        <c:set var="count" value="1" scope="page"/>
        <c:forEach items="${topform}" var="entry">
            <div class="pie-container">
                <div id="form<c:out value = "${count}"/>" class="pie"></div>
                <c:set var="count" value="${count + 1}" scope="page"/>
            </div>
            <div class="stats">
                <ul>
                    <li data-name="form<c:out value = "${count}"/>">${entry.key}</li>
                </ul>
            </div>
            <h1>${entry.key} ${entry.value}</h1>
        </c:forEach>
    </section>
</main>
</body>
</html>


</body>
</html>