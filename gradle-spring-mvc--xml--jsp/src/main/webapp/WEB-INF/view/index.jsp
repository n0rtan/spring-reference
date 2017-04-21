<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>

<spring:url value="/resources/js/main.js" var="mainjs" />

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Gradle-Spring-MVC / XML / JSP - Reference Application</title>

    <link href="<c:url value="/resources/css/main.css" />" rel="stylesheet" />
    <script src="${mainjs}"></script>

</head>
<body>

    <h2>${message}</h2>

    Language : <a href="?language=en">English</a> | <a href="?language=ru">Russian</a>
    <div><spring:message code="message" /> </div>
    Current Locale : ${pageContext.response.locale} / ${locale}

</body>
</html>