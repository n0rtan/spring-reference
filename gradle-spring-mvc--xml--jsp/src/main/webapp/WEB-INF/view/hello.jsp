<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<spring:url value="/resources/js/main.js" var="mainjs" />
<c:set var="contextPath" value="${pageContext.request.contextPath}" />

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Gradle-Spring-MVC / XML / JSP - Reference Application</title>

    <link href="${contextPath}/resources/css/main.css" rel="stylesheet" />
    <script src="${mainjs}"></script>

</head>
<body>

    <h2>Hello ${name}</h2>

    <div>
        <a href="/">Home</a>
    </div>

</body>
</html>