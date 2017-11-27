<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <title>Feedback Form</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body style="background-color: palegreen;">
        <%@include file="./header.jsp"  %>
        <h2 align="center">Welcome to the feedback form</h2>
        <h3>&twoheadrightarrow;<u>Instructions</u></h3> 
        &blacktriangleright; Meaningful stuff something that makes sense that is point 1<br>
        &blacktriangleright; Meaningful stuff something that makes sense that is point 2<br>
        &blacktriangleright; Meaningful stuff something that makes sense that is point 3<br>
        &blacktriangleright; Meaningful stuff something that makes sense that is point 4<br>
        &blacktriangleright; Meaningful stuff something that makes sense that is point 5<br>
        &blacktriangleright; Meaningful stuff something that makes sense that is point 6<br>
        &blacktriangleright; Meaningful stuff something that makes sense that is point 7<br>
        &blacktriangleright; Meaningful stuff something that makes sense that is point 8<br><br><br>
        <div style="padding-bottom: 6.5cm;">
        <form style="border: double; padding-left: 2em; padding-right: 2em ;float: left; padding-bottom: 1em;width: 30%;margin-left: 30px;" action="./next" method="POST">
            <h2>Enter Details</h2>
                <table>
                <tr>
                    <td style="padding-bottom: 10px;">University Roll:</td>
                    <td style="padding-left: 20px;padding-bottom: 10px;">Password:</td>
                </tr>
                <tr>
                    <td style="padding-bottom: 10px;"><input type="text" id="cid" name="cid" placeholder="Enter University Roll No." required=""></td>
                    <td style="padding-left: 20px;padding-bottom: 10px;"><input type="password" id="pass" name="pass" required=""></td>
                </tr>
                <tr>
                    <td><input type="submit" value ="Submit" name="submit"/></td>
                </tr>
            </table>
        </form>
        <form style="border: double; padding-left: 2em; padding-right:2em ;padding-bottom: 1em;float: right;width: 40%;margin-right: 30px;" action="./adminlog" method="POST">
            <h2 style="padding-left: 15px;">Admin Login</h2>
            <table>
                <tr>
                    <td style="padding-left: 10px;padding-bottom: 10px; padding-right: 30px;">Enter Username:</td> 
                    <td style="padding-left: 10px;padding-bottom: 10px;">Enter Password:</td>
                </tr>
                <tr>
                    <td style="padding-left: 10px;padding-bottom: 10px;padding-right: 30px;"><input type="text" id="uid" name="uid" placeholder="Enter Username" required=""></td>
                    <td style="padding-left: 10px;padding-bottom: 10px;"><input type="password" id="password" name="password" required=""></td>
                </tr>
            </table>
            <br>
            <span style="padding-left: 10px;"><input type="submit" value ="Login" name="login"/></span>
            </form>
        </div>
        <%@include file="./footer.jsp" %>
    </body>
</html>
