<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<html>
<jsp:include page="headTag.jsp"/>
<link href="<c:url value="/resources/css/addFile.css"/>" rel="stylesheet">


<body>
<div class="container">
    <div class="jumbotron bg-light">
        <h1>CSV-PARSER</h1>
        <form method="post" action="CSV/upload" enctype="multipart/form-data">
            <label for="file" class="col-form-label">UPLOAD CSV FILE</label>
            <input type="file" name="file" id="file" class="input-file">
            <label for="file" class="btn btn-tertiary js-labelFile">
                <i class="icon fa fa-check"></i>
                <span class="js-fileName">Choose a file</span>
            </label>
            <button type="submit">Upload</button>
        </form>
    </div>
</div>
<!--REPORTS -->
<div class="container marketing">
    <div class="row shadow p-3 mb-5 bg-light rounded">
        <div class="col-lg-4 border-dark">
            <img class="img-circle" src="${pageContext.request.contextPath}/resources/images/1.png/">
            <form action="CSV/report">
                <button>Show Report</button>
            </form>
        </div>
        <div class="col-lg-4">
            <img class="img-circle" src="${pageContext.request.contextPath}/resources/images/2.png">
            <form action="CSV/notFinished">
                <button>Show Report</button>
            </form>
        </div>
        <div class="col-lg-4">
            <img class="img-circle" src="${pageContext.request.contextPath}/resources/images/3.gif">
            <form action="CSV/topFive/">
                <button>Show Report</button>
            </form>
        </div>
    </div>
</div>
<div class="loaderArea">
    <div class="loader"></div>
</div>
</body>
</html>