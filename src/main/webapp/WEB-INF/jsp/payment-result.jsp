<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Payment Result</title>
</head>
<body>
    <h1>Payment Result</h1>
    <p>
    <% if ((Boolean) request.getAttribute("paymentResult")) { %>
        Payment was successful.
    <% } else { %>
        Payment failed.
    <% } %>
    </p>
</body>
</html>