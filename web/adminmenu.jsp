<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Admin Panel</title>
    </head>
    <body style="background-color: #009999;">
        <%@include file="./header.jsp" %>
        <h1 align="middle">Hello <%= session.getAttribute("name") %></h1>
        <h2 style="font-family: cursive; padding-left: 15px;">Faculty Panel</h2>
        <form method="POST" action="./addfac">
        <span style="padding-left:20px;">View All:</span>
        <span style="padding-left: 20px;">
        <select>
             <%
                for(String i : (ArrayList <String>)session.getAttribute("fname"))
                    {
                       out.println("<option>"+ i +"</option>");
                    }
              %>      
        </select>
        </span>
        <span style="padding-left:450px;">Add new faculty:</span>
        <span style="padding-left: 20px;"><input style="padding-right: 15px;" type="text" name="fnew" placeholder="Faculty Name(Abb.)Branch" required=""/></span>
        <span style="padding-left: 20px;"><input type="submit" value="Submit" name="Submit"></span>
        </form>
        <br>
        <h2 style="font-family: cursive; padding-left: 15px;">Subject Panel</h2>
        <form method="POST" action="./addsub">
        <span style="padding-left:20px;">View All:</span>
        <span style="padding-left: 20px;">
        <select>
             <%
                for(String j : (ArrayList <String>)session.getAttribute("sname"))
                    {
                       out.println("<option>"+ j +"</option>");
                    }
              %>      
        </select>
        </span>
        <span style="padding-left:440px;">Add new Subject:</span>
        <span style="padding-left: 20px;"><input style="padding-right: 15px;" type="text" placeholder="Subject Name(Subject Code)" name="snew" required=""/></span>
        <span style="padding-left: 20px;"><input type="submit" value="Submit" name="Submit"></span>
        </form>
        <h2 style="font-family: cursive; padding-left: 15px;">Delete Panel</h2>
        <form action="./delfac" method="POST">
         <span style="padding-left:20px;">Select Faculty:</span> 
         <span style="padding-left: 20px;">   
         <select name="dfaculty">
             <%
                for(String i : (ArrayList <String>)session.getAttribute("fname"))
                    {
                       out.println("<option>"+ i +"</option>");
                    }
              %>   
        </select>
         </span>
        <span style=" padding-left: 90px;"><input type="submit" value="Delete" name="submit" /></span>
        </form>
        <form style=" padding-top: 30px;" method="POST" action="./delsub">
         <span style="padding-left:20px;">Select Subject:</span> 
         <span style="padding-left: 20px;"> 
        <select name="dsubject">
             <%
                for(String i : (ArrayList <String>)session.getAttribute("sname"))
                    {
                       out.println("<option>"+ i +"</option>");
                    }
              %>   
        </select>
         </span>
        <span style="padding-left: 83px;"><input type="submit" value="Delete" name="submit" /></span>
        </form>
        <h2 style="font-family: cursive; padding-left: 15px;">Grade Check Panel:</h2>
        <form method="POST" action="./gradecheck">
         <span style="padding-left:20px;">Select Faculty:</span> 
         <span style="padding-left: 20px;">   
         <select name="sfaculty">
             <%
                for(String i : (ArrayList <String>)session.getAttribute("fname"))
                    {
                       out.println("<option>"+ i +"</option>");
                    }
              %>   
        </select>
         </span>
        <span style="padding-left:180px;">Select Subject:</span> 
        <span style="padding-left: 20px;"> 
        <select name="ssubject">
             <%
                for(String i : (ArrayList <String>)session.getAttribute("sname"))
                    {
                       out.println("<option>"+ i +"</option>");
                    }
              %>   
        </select>
         </span>
        <span style=" padding-left: 90px;"><input type="submit" value="Check" name="submit" /></span>
        </form>
        <h2 style="font-family: cursive; padding-left: 15px;">Single Student Entry Panel</h2>
        <form method="POST" action="./studentry">
        <span style="padding-left:20px;">ID:</span>
        <span style="padding-left:20px;"><input type="text" name="cid" required="" placeholder="Enter ID"/></span>
        <span style="padding-left:20px;">Branch:</span>
        <span style="padding-left:20px;"><input type="text" name="branch" required="" placeholder="Enter branch"/></span>
        <span style="padding-left:20px;">Year:</span>
        <span style="padding-left:20px;"><input type="text" name="year" required="" placeholder="Enter year"/></span>
        <span style="padding-left:20px;">Semester:</span>
        <span style="padding-left:20px;"><input type="text" name="sem" required="" placeholder="Enter sem"/></span>
        <span style="padding-left:20px;"><input type="submit" value="Submit" name="submit" /></span>
        </form>
        <h2 style="font-family: cursive; padding-left: 15px;">Multiple Student Entry Panel</h2>
        <form method="POST" action="./mstudentry">
        <span style="padding-left:20px;">From ID:</span>
        <span style="padding-left:20px;"><input type="text" name="cid1" required="" placeholder="Enter first ID"/></span>
        <span style="padding-left:20px;">To ID:</span>
        <span style="padding-left:20px;"><input type="text" name="cid2" required="" placeholder="Enter last ID"/></span>
        <span style="padding-left:20px;">Branch:</span>
        <span style="padding-left:20px;"><input type="text" name="branch" size="10px" required="" placeholder="Enter branch"/></span>
        <span style="padding-left:20px;">Year:</span>
        <span style="padding-left:20px;"><input type="text" name="year" size="10px" required="" placeholder="Enter year"/></span>
        <span style="padding-left:20px;">Semester:</span>
        <span style="padding-left:20px;"><input type="text" name="sem" size="10px" required="" placeholder="Enter sem"/></span>
        <span style="padding-left:20px;"><input type="submit" value="Submit" name="submit" /></span>
        </form>
        <br><br>
        <a style="padding-left: 48%;" href="./refresh">Refresh Entries</a>
        <a style="padding-left: 50%;" href="./logout">Log Out</a>
        <%@include file="./footer.jsp" %>
    </body>
</html>
