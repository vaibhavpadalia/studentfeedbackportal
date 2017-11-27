<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Profile Page</title>
    </head>
    <body style="background-color: aqua;">
        <%@include file="./header.jsp" %>
        <h1 align="center">Your Information</h1>
        <form style="padding-bottom: 1.5em;" action="./enter" method="POST">
        <table align="center">
            <tr>
                <td style="padding-top: 15px;padding-right: 30px; padding-bottom: 30px;">Your University roll no:</td>
                <td style="padding-top: 15px;padding-bottom: 30px;"><input type="text" name="cid" value="${cid}" readonly=""></td>
            </tr>
            <tr>
                <td style="padding-top: 15px;padding-right: 30px; padding-bottom: 30px;">Your Branch:</td>
                <td style="padding-top: 15px;padding-bottom: 30px;"><input type="text" name="branch" value="${branch}" readonly=""></td>
            </tr>
            <tr>
                <td style="padding-top: 15px;padding-right: 30px; padding-bottom: 30px;">Your Batch:</td>
                <td style="padding-top: 15px;padding-bottom: 30px;"><input type="text" name="year" value="${year}" readonly=""></td>
            </tr>
            <tr>
                <td style="padding-top: 15px;padding-right: 30px; padding-bottom: 30px;">Your Semester:</td>
                <td style="padding-top: 15px;padding-bottom: 30px;"><input type="text" name="cid" value="${sem}" readonly=""></td>
            </tr>
            <tr>
                <td style="padding-top: 15px;padding-right: 30px; padding-bottom: 30px;">Enter Faculty's Name:</td>
                <td style="padding-top: 15px;padding-bottom: 30px;">
                    <select name="fselect">
                      <%
                         for(String i : (ArrayList <String>)session.getAttribute("fname"))
                           {
                               out.println("<option>"+ i +"</option>");
                           } 
                      %>
                    </select></td>
            </tr>
            <tr>
                <td style="padding-top: 15px;padding-right: 30px; padding-bottom: 30px;">Enter Subject:</td>
                <td style="padding-top: 15px;padding-bottom: 30px;">
                    <select name="sselect">
                      <%
                         for(String j : (ArrayList <String>)session.getAttribute("sname"))
                           {
                               out.println("<option>"+ j +"</option>");
                           } 
                      %>
                    </select>
                </td>
            </tr>
        </table>
            <br>
            <input style="margin-left: 50%;" type="submit" value="Submit" name="submit" />
        </form>
                    <a style="padding-left: 48%;" href="chgpass.jsp">Change Password</a><br>
                    <a style="padding-left: 50%;" href="./logout">Log Out</a>
        <%@include file="./footer.jsp" %>
        
    </body>
</html>
