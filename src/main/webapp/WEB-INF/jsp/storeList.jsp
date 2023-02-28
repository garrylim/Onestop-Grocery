<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<h2>Store List</h2>

<!-- Search form -->
<form action="${pageContext.request.contextPath}/search" method="GET">
    <div class="form-group">
        <input type="text" class="form-control" name="q" placeholder="Search by name or locality">
    </div>
    <button type="submit" class="btn btn-primary">Search</button>
</form>

<!-- Store list table -->
<table class="table table-striped">
    <thead>
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Phone Number</th>
            <th>Localities</th>
            <th>Action</th>
        </tr>
    </thead>
    <tbody>
        <c:forEach items="${stores}" var="store">
            <tr>
                <td>${store.id}</td>
                <td>${store.name}</td>
                <td>${store.phoneNumber}</td>
                <td>${store.localities}</td>
                <td>
                    <a href="${pageContext.request.contextPath}/updateStore/${store.id}" class="btn btn-sm btn-primary">Edit</a>
                    <a href="${pageContext.request.contextPath}/deleteStore/${store.id}" class="btn btn-sm btn-danger">Delete</a>
                </td>
            </tr>
        </c:forEach>
    </tbody>
</table>

</html>
