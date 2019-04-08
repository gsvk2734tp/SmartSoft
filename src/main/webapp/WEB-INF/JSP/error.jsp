<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<link href="<c:url value="/resources/css/error.scss" />" rel="stylesheet">
<body>
<div class="mars"></div>
<img src="${pageContext.request.contextPath}/resources/images/error/404.svg" class="logo-404" />
<img src="${pageContext.request.contextPath}/resources/images/error/meteor.svg" class="meteor" />
<p class="title">Oh no!!</p>
<p class="subtitle">
    You’re either misspelling the URL <br /> or requesting a page that's no longer here.
</p>
<div align="center">
    <a class="btn-back" href="/">Back to home page</a>
</div>
<img src="${pageContext.request.contextPath}/resources/images/error/astronaut.svg" class="astronaut" />
<img src="${pageContext.request.contextPath}/resources/images/error/spaceship.svg" class="spaceship" />
</body>
</html>
