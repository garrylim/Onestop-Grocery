<%@ page contentType="text/html;charset=UTF-8" language="java" %>
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