<%-- 
    Document   : Home
    Created on : Feb 1, 2017, 12:37:13 PM
    Author     : aschindler1
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Results</title>
    </head>
    <body>
        <div>
            <h2>Welcome to the Rectangular Area finder!</h2><br><br>
            Enter two numbers below, use this to calculate the area! Numbers only, or this code will yell at you.<br><br>
            <form id="form1" name="form1" method="POST" action="CalArea"> 
                Number 1: <input id="numberOne" name="numberOne" type="number"> 
                Number 2: <input id="numberTwo" name="numberTwo" type="number"><br>
                <input id="submitForm" name="submitForm" type="submit" value="Submit name"><br><br>
                Current result = ${resultRect};
            </form>
        </div>
    </body>
</html>
