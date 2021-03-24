<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add Details</title>
</head>
<body>
<h2>Enter your details</h2>
<form:form action="/spring/showDetails" modelAttribute="employee">
    Name<form:input path="name"/>
    <br>
    Surname<form:input path="surname"/>
    <br>
    Salary<form:input path="salary"/>
    <br>
    <input type="submit" value="send">
</form:form>
</body>
</html>
