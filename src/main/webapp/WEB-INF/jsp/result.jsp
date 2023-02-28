<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
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