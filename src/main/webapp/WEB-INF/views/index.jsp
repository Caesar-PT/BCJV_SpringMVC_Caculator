<%--
  Created by IntelliJ IDEA.
  User: thanh
  Date: 02/02/2021
  Time: 6:49 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Calculator</title>
</head>
<body>
<h1>Simple Calculator</h1>
<form method="post" action="/cal">
    <input type="text" name="input1" >
    <input type="text" name="input2">
    <input type="submit" value="+" name="operator">
    <input type="submit" value="-" name="operator">
    <input type="submit" value="*" name="operator">
    <input type="submit" value="/" name="operator">
</form>
<h1>Result: ${result}</h1>
<h1>${error}</h1>
</body>
</html>