<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Change Password</title>
    </head>
    <body>
        <%@include file="./header.jsp" %>
        <h1>Change Password</h1>
        <form method="POST" action="./chpass" style="padding-bottom: 8.5cm;">
            Enter Old Password:
            <input type="password" name="password" required="" /><br><br>
            Enter New Password:
            <input type="password" name="npassword" required="" /><br><br>
            Enter New Password Again:
            <input type="password" name="rpassword" required="" /><br><br>
            <input type="submit" name="submit" value="Submit" />
        </form>
        <%@include file="./footer.jsp" %>
    </body>
</html>
