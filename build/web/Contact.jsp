<%-- 
    Document   : ContactUs
    Created on : Nov 16, 2018, 10:27:34 AM
    Author     : Akhilesh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <head>
        <title>Contact Us</title> 
<meta name="viewport" content="width=device-width, initial-scale=0">
<style>
body {
  background-color:white;
}
h4{
    color:#000066;
    font-size:35px;
}
.container h3
{
 text-align: center;
 color:#000066;
}
p
{
     font-family:Times Roman; 
     font-size:20px;
     color:darkcyan;
     text-align: center;
}

.container {
  overflow: hidden;
  background-color: white;
  width:60%;
  margin:0 auto; 
  padding:18px;
  border-radius: 3px;
  box-shadow:3px 3px 5px 6px #ccc;
}
input[type=text]{
    width: 40%;
    padding:12px 20px;
    border: 1px solid;
    border-color: lightgrey;
    border-radius: 18px;
    box-sizing: border-box;
    margin-top: 6px;
    margin-bottom: 14px;
    resize: vertical;
}
textarea {
    width: 50%;
    padding: 12px;
    border: 1px solid #ccc;
    border-radius: 12px;
    box-sizing: border-box;
    margin-top: 6px;
    border-color: lightgrey;
    margin-bottom: 16px;
    resize: vertical;
}
input[type=submit] {
    background-color: lightseagreen;
    color: white;
    padding: 12px 20px;
    border-radius: 4px;
    border:none;
    cursor: pointer;
}

input[type=submit]:hover {
    background-color: darkcyan;
}
</style>
 <%@include file="Header2.jsp"%>
    <body>
        <center><h4><i>Contact Us</i></h4></center>
        <div class="container">
            <p>
                <b>For any queries related the application please feel free to drop a mail at questionme304@gmail.com</b>
            </p>
               <h3>Your Valuable Feedback Means Alot</h3>
               <center><form action="feedback" method="post">
    <input type="text" name="fname" placeholder="Enter your First Name" required>
    <input type="text" name="lname" placeholder="Enter your Last Name" required>
    <br>
    <textarea id="subject" name="subject" placeholder="Write something.." style="height:200px"></textarea>
     <br>
    <center><input type="submit" value="Submit"></center>
                   </form></center>
        </div>
        <br>
    </body>