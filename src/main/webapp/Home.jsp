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
            <h2>Welcome to the Area finder!</h2><br><br>
            Below, you will find many area calculators you can use.<br><br>
            Rectangle:
            <img src="https://upload.wikimedia.org/wikipedia/commons/thumb/d/d7/Rectangle_Geometry_Vector.svg/220px-Rectangle_Geometry_Vector.svg.png">
            <form id="RectForm" name="RectForm" method="POST" action="CalArea?calcType=Rectangle"> 
                Number 1: <input id="numberOne" name="numberOne" type="number"/> 
                Number 2: <input id="numberTwo" name="numberTwo" type="number"/><br>
                <input id="submitForm" name="submitForm" type="submit" value="Submit"><br><br>
                Current result = ${resultRect};<br><br>
            </form>
            Circle:
            <img src="http://m.mathblaster.com/Mathblaster/CoolMath/Article-Images/radius-of-a-circle.jpg">
            <form id="CircleForm" name="CircleForm" method="POST" action="CalArea?calcType=Circle"> 
                Radius: <input id="Radius" name="Radius" type="number"/> <br>
                <input id="submitForm" name="submitForm" type="submit" value="Submit"><br><br>
                Current result = ${resultCirc};<br><br>
            </form>
            Pythagorean:
            <img src="https://upload.wikimedia.org/wikipedia/commons/thumb/d/d2/Pythagorean.svg/260px-Pythagorean.svg.png">
            <form id="TriangleForm" name="TriangleForm" method="POST" action="CalArea?calcType=Triangle"> 
                Side 1: <input id="numberOne" name="numberOne" type="number"/> 
                Side 2: <input id="numberTwo" name="numberTwo" type="number"/><br> 
                <input id="submitForm" name="submitForm" type="submit" value="Submit"/><br><br>
                Current result = ${resultTrig};<br><br>
            </form>            
        </div>
    </body>
</html>
