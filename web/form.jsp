<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Feedback Form</title>
    </head>
    <body style="background-color:  plum;">
        <%@include file="./header.jsp" %>
        <h1>Hello <%=session.getAttribute("cid")%></h1>
        <h2 style="float: left;">About :"<%= session.getAttribute("ffinal")%>"</h2>
        <h2 style="float:right;">Subject :"<%= session.getAttribute("sfinal")%>"</h2>
        <form style="padding-top: 5em; padding-bottom: .5em;" method="POST" action="./feed">
            <b>Q1.</b>Whether the syllabus was properly defined with clarity about the depth in each topic? 
        <div style="padding-left: 25px; padding-top: 5px; padding-bottom: 20px;">
            Excellent<input type="radio" name="10" value="4" required=""/>
        Good<input type="radio" name="10" value="3"/>
        Fair<input type="radio" name="10" value="2"/>
        Poor<input type="radio" name="10" value="1"/></div>
            <b>Q2.</b>Whether the lesson plan and model question paper helped you in the preparation of the subject? 
        <div style="padding-left: 25px; padding-top: 5px; padding-bottom: 20px;">
        Very Much Helpful<input type="radio" name="11" value="4" required=""/>
        Satisfactory<input type="radio" name="11" value="3"/>
        Unsatisfactory<input type="radio" name="11" value="2"/>
        Lesson-plan and model question paper were not provided<input type="radio" name="11" value="1"/></div>
            <b>Q3.</b>Information provided by the teacher about the reading material/books etc for various topics in the course was - 
        <div style="padding-left: 25px; padding-top: 5px; padding-bottom: 20px;">
        Excellent<input type="radio" name="12" value="4" required=""/>
        Good<input type="radio" name="12" value="3"/>
        Satisfactory<input type="radio" name="12" value="2"/>
        Teacher did not provide any information<input type="radio" name="12" value="1"/></div>
            <b>Q4.</b>New knowledge provided by different topics of the course was-
        <div style="padding-left: 25px; padding-top: 5px; padding-bottom: 20px;">
        Excellent<input type="radio" name="13" value="4" required=""/>
        Good<input type="radio" name="13" value="3"/>
        Satisfactory<input type="radio" name="13" value="2"/>
        Teacher did not provide any information<input type="radio" name="13" value="1"/></div>
            <b>Q5.</b>Does the teacher come to class in time?
        <div style="padding-left: 25px; padding-top: 5px; padding-bottom: 20px;">
        Always<input type="radio" name="14" value="4" required=""/>
        Most of the time<input type="radio" name="14" value="3"/>
        Sometimes<input type="radio" name="14" value="2"/>
        Always late<input type="radio" name="14" value="1"/></div>
            <b>Q6.</b>Teacher's writing on the board is-
        <div style="padding-left: 25px; padding-top: 5px; padding-bottom: 20px;">
        Readable and Understandable<input type="radio" name="15" value="4" required=""/>
        Readable but not understandable<input type="radio" name="15" value="3"/>
        Neither Readable nor understandable<input type="radio" name="15" value="2"/>
        Rarely uses the board<input type="radio" name="15" value="1"/></div>
            <b>Q7.</b>Teacher's voice while teaching is -
        <div style="padding-left: 25px; padding-top: 5px; padding-bottom: 20px;">
        Loud and clear<input type="radio" name="16" value="4" required=""/>
        Loud but not clear<input type="radio" name="16" value="3"/>
        Not loud but clear<input type="radio" name="16" value="2"/>
        Neither loud nor clear<input type="radio" name="16" value="1"/></div>
            <b>Q8.</b>Teacher's control in the class is- 
        <div style="padding-left: 25px; padding-top: 5px; padding-bottom: 20px;">
        Excellent<input type="radio" name="17" value="4" required=""/>
        Good<input type="radio" name="17" value="3"/>
        Fair<input type="radio" name="17" value="2"/>
        Poor<input type="radio" name="17" value="1"/></div>
            <b>Q9.</b>Teacher's movements (postures and gestures) during lecture are appropriate- 
        <div style="padding-left: 25px; padding-top: 5px; padding-bottom: 20px;">
        Always<input type="radio" name="18" value="4" required=""/>
        Most of the time<input type="radio" name="18" value="3"/>
        Sometimes<input type="radio" name="18" value="2"/>
        Never<input type="radio" name="18" value="1"/></div>
            <b>Q10.</b>Does the teacher come well prepared in the class?
        <div style="padding-left: 25px; padding-top: 5px; padding-bottom: 20px;">
        Always<input type="radio" name="19" value="4" required=""/>
        Most of the time<input type="radio" name="19" value="3"/>
        Sometimes<input type="radio" name="19" value="2"/>
        Never<input type="radio" name="19" value="1"/></div>
            <b>Q11.</b>Regularity of the class held was-
        <div style="padding-left: 25px; padding-top: 5px; padding-bottom: 20px;">
        Outstanding<input type="radio" name="20" value="4" required=""/>
        Good<input type="radio" name="20" value="3"/>
        Satisfactory<input type="radio" name="20" value="2"/>
        Poor<input type="radio" name="20" value="1"/></div>
            <b>Q12.</b>Lecture delivered by the teacher is - 
        <div style="padding-left: 25px; padding-top: 5px; padding-bottom: 20px;">
        Interesting and motivates to think logically and objectively<input type="radio" name="21" value="4" required=""/>
        Understandable and clarifies the topics<input type="radio" name="21" value="3"/>
        Satisfactory<input type="radio" name="21" value="2"/>
        Poor<input type="radio" name="21" value="1"/></div>
            <b>Q13.</b>Does the teacher deviate from the subject and discusses other related topics and application?
        <div style="padding-left: 25px; padding-top: 5px; padding-bottom: 20px;">
        Quite<input type="radio" name="22" value="4" required=""/>
        Sometimes<input type="radio" name="22" value="3"/>
        Rarely<input type="radio" name="22" value="2"/>
        Never<input type="radio" name="22" value="1"/></div>
            <b>Q14.</b>Does the teacher encourage the students to ask questions and interacts with the students?
        <div style="padding-left: 25px; padding-top: 5px; padding-bottom: 20px;">
        Always<input type="radio" name="23" value="4" required=""/>
        Most of the time<input type="radio" name="23" value="3"/>
        Sometimes<input type="radio" name="23" value="2"/>
        Never<input type="radio" name="23" value="1"/></div>
            <b>Q15.</b>Syllabus covered by the teacher - 
        <div style="padding-left: 25px; padding-top: 5px; padding-bottom: 20px;">
        100% covered at an appropriate pace<input type="radio" name="24" value="4" required=""/>
        About 90% covered at appropriate pace(Some topics left)<input type="radio" name="24" value="3"/>
        Started slowly and rushed up to the end<input type="radio" name="24" value="2"/>
        Did not complete the syllabus<input type="radio" name="24" value="1"/></div>
            <b>Q16.</b>Does the teacher use variety of methods and materials (OHP,chart,models etc) 
        <div style="padding-left: 25px; padding-top: 5px; padding-bottom: 20px;">
        Always<input type="radio" name="25" value="4" required=""/>
        Mostly<input type="radio" name="25" value="3"/>
        Sometimes<input type="radio" name="25" value="2"/>
        Never<input type="radio" name="25" value="1"/></div>
            <b>Q17.</b>Overall quality of "teaching and learning" in this course was-
        <div style="padding-left: 25px; padding-top: 5px; padding-bottom: 20px;">
        Excellent<input type="radio" name="26" value="4" required=""/>
        Good<input type="radio" name="26" value="3"/>
        Satisfactory<input type="radio" name="26" value="2"/>
        Poor<input type="radio" name="26" value="1"/></div>
            <b>Q18.</b>Teacher's attitude towards evaluation of test papers and assignments 
        <div style="padding-left: 25px; padding-top: 5px; padding-bottom: 20px;">
        Promptly return is time with feedback<input type="radio" name="27" value="4" required=""/>
        Promptly return with no feedback<input type="radio" name="27" value="3"/>
        Promptly late with no feedback<input type="radio" name="27" value="2"/>
        Return late/never with no feedback<input type="radio" name="27" value="1"/></div>
            <b>Q19.</b>Teacher's evaluation is biased based on- 
        <div style="padding-left: 25px; padding-top: 5px; padding-bottom: 20px;">
        It is unbiased<input type="radio" name="28" value="4" required=""/>
        Gender<input type="radio" name="28" value="3"/>
        Caste<input type="radio" name="28" value="2"/>
        Personal liking/disliking of students<input type="radio" name="28" value="1"/></div>
            <b>Q20.</b>Availability and approachability of teacher outside classroom for guidance  
        <div style="padding-left: 25px; padding-top: 5px; padding-bottom: 20px;">
        Excellent<input type="radio" name="29" value="4" required=""/>
        Good<input type="radio" name="29" value="3"/>
        Fair<input type="radio" name="29" value="2"/>
        Poor<input type="radio" name="29" value="1"/></div>
            <div style="margin-left: 50%;"><input type="submit" value="Submit" name='submit'></div>
        </form>
        <a style="padding-left: 50%;" href="./logout">Log Out</a>
        <%@include file="./footer.jsp" %>
    </body>
</html>
