<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Payment Processing</title>
</head>
<body>
    <h1>Payment Processing</h1>
    <form method="post" action="/process-payment">
        <input type="radio" name="paymentMethod" value="googlepay"> Google Pay<br>
        <input type="radio" name="paymentMethod" value="creditcard"> Credit Card<br>
        <input type="submit" value="Submit">
    </form>
</body>
</html>