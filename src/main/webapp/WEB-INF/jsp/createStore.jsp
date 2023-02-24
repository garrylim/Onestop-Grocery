<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Create a new store</title>
</head>
<body>
    <h1>Create a new store</h1>
    <form action="${pageContext.request.contextPath}/createStore" method="post">
        <label for="name">Name:</label>
        <input type="text" id="name" name="name" value="${store.name}" /><br />
        <label for="address">Address:</label>
        <input type="text" id="address" name="address" value="${store.address}" /><br />
        <input type="submit" value="Create" />
    </form>
</body>
</html>
