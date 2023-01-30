<%-- 
    Document   : arithmeticCalculator
    Created on : 29-Jan-2023, 2:22:16 PM
    Author     : 882199
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic Calculator</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
        <form method="post" action="arithmetic">
            First: <input type="text" name="firstNum" value="${numOne}">
            <br>
            Second: <input type="text" name="secondNum" value="${numTwo}">
            <br>
            <input type="submit" name="operation" value="+">
            <input type="submit" name="operation" value="-">
            <input type="submit" name="operation" value="*">
            <input type="submit" name="operation" value="%">
            <br><br>
            Result: ${finalAnswer}
            <br>
            <a href="age">Age Calculator</a>
        </form>
    </body>
</html>
