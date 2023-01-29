<%-- 
    Document   : ageCalculator
    Created on : 29-Jan-2023, 2:21:56 PM
    Author     : 882199
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Age Calculator</title>
    </head>
    <body>
        <h1>Age Calculator</h1>
        <form method="post" action="age">
            Enter your age: <input type="text" name="userAge" value="${userAge}">
            <br>
            <input type="submit" value="Age next birthday">
            <br>
            <p>
                ${userAgeResults}
            </p>
            <a href="arithmetic">Arithmetic Calculator</a>
        </form>
    </body>
</html>
