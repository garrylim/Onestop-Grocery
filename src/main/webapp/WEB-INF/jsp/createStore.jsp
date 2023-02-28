<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
<meta charset="UTF-8">
<title>Create Store</title>
</head>
<body>
    <h1>Create Store</h1>
    <form:form method="post" modelAttribute="store" action="/createStore">
        <table>
            <tr>
                <td><label for="name">Name:</label></td>
                <td><form:input path="name" id="name" /></td>
            </tr>
            <tr>
                <td><label for="phoneNumber">Phone Number:</label></td>
                <td><form:input path="phoneNumber" id="phoneNumber" /></td>
            </tr>
            <tr>
                <td><label for="localities">Localities:</label></td>
                <td><form:input path="localities" id="localities" /></td>
            </tr>
            <tr>
                <td colspan="2"><input type="submit" value="Save" /></td>
            </tr>
        </table>
    </form:form>
</body>
</html>
