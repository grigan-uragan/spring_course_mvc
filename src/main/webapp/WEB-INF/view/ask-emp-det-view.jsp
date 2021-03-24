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
    <form:errors path="name"/>
    <br>
    Surname<form:input path="surname"/>
    <form:errors path="surname"/>
    <br>
    Salary<form:input path="salary"/>
    <form:errors path="salary"/>
    <br>
    Department <form:select path="department">
                     <form:options items="${employee.departments}"/>
                </form:select>
    <br>
    What car you want? <form:radiobuttons path="carBrand" items="${employee.carBrands}"/>
    <br>
    Foreign language(s) <form:checkboxes path="languages" items="${employee.langList}"/>
    <br>
    <input type="submit" value="send">
</form:form>
</body>
</html>
