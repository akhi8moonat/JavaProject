<%-- 
    Document   : Ask
    Created on : Nov 21, 2018, 8:03:34 PM
    Author     : Akhilesh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <head>
   <title>Answer</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<style>
    body {
  background-color:white;
}
p{
    color:#000066;
    font-size:25px;
    font-family: "Times New Roman" ;
}
body {font-family: Arial, Helvetica, sans-serif;}
* {box-sizing: border-box;}
input[type=submit] {
    background-color: lightseagreen;
    color: white;
    padding: 12px 20px;
    border-radius: 4px;
    border:12px;
    cursor: pointer;
}

input[type=submit]:hover {
    background-color: darkcyan;
}
.container {
    border-radius: 5px;
    background-color: white;
    padding: 10px;
    width:40%;
    margin:0 auto;
    box-shadow:3px 3px 5px 6px #ccc;
}
textarea {
    width: 70%;
    padding: 12px;
    border: 1px solid #ccc;
    border-radius: 12px;
    box-sizing: border-box;
    margin-top: 6px;
    border-color: lightgrey;
    margin-bottom: 16px;
    resize: vertical;
}
</style>
</head>
<body>
    <%@include file="Header2.jsp"%>
    <br>
    <br>
    <br>
<div class="container">
    <center><p><i>Answer Here</i></p></center>
    <center><form action="Answer" method="post">
      <textarea id="subject" name="ans" placeholder="Write your Answer here.." style="height:100px"></textarea>
      <br>
      <input type="submit" value="Submit">
        </form></center>
</div>
</body>
</html>
