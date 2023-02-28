<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Create User</title>
    </head>
    <body>
        <h1>Create User</h1>
        <form action="/createUser" method="POST">
            <label for="email">Email:</label>
            <input type="email" name="email" required><br>
            <label for="username">Username:</label>
            <input type="text" name="username" required><br>
            <label for="password">Password:</label>
            <input type="password" name="password" required><br>
            <input type="submit" value="Create User">
        </form>
        <p>${message}</p>
    </body>
</html>
