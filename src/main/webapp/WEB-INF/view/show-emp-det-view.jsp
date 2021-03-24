<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Your details</title>
</head>
<body>
<h2>Your details</h2>
<p>${employee.name}</p>
<p>${employee.surname}</p>
<p>${employee.salary}</p>
<p>${employee.department}</p>
<p>${employee.carBrand}</p>
<ul>
    <c:forEach var="lang" items="${employee.languages}">
        <li>${lang}</li>
    </c:forEach>
</ul>



</body>
</html>
