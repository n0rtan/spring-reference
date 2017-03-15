<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<spring:url value="/resources/js/main.js" var="mainjs" />

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Gradle-Spring-MVC / XML / JSP - Reference Application</title>

    <link href="<c:url value="/resources/css/main.css" />" rel="stylesheet" />
    <script src="${mainjs}"></script>

</head>
<body>

    <h2>${message}</h2>

</body>
</html>