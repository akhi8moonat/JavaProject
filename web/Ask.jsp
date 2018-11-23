<%-- 
    Document   : Ask
    Created on : Nov 21, 2018, 8:03:34 PM
    Author     : Akhilesh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <head>
   <title>Ask Question</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<style>
    body {
  background-image: url("blue.jpg");
}
h3{
    color:#000066;
    font-size:25px;
    font-family: "Times New Roman" ;
}
body {font-family: Arial, Helvetica, sans-serif;}
* {box-sizing: border-box;}

input[type=text],select{
    width: 40%;
    padding:12px 20px;
    border: 1px solid;
    border-color: lightgrey;
    border-radius: 18px;
    box-sizing: border-box;
    margin-top: 6px;
    margin-bottom: 14px;
    resize: vertical;
    -webkit-transition: all 0.30s ease-in-out;
  -moz-transition: all 0.30s ease-in-out;
  -ms-transition: all 0.30s ease-in-out;
  -o-transition: all 0.30s ease-in-out;
  outline: none;
}
input[type=text]:focus,input[type=password]:focus{
  box-shadow: 0 0 5px rgba(81, 203, 238, 1);
  padding: 3px 0px 3px 3px;
  margin: 5px 1px 3px 0px;
  border: 1px solid rgba(81, 203, 238, 1);
}
input[type=password]{
    width: 40%;
    padding:12px;
    border: 1px solid;
    border-color: lightgrey;
    border-radius: 18px;
    box-sizing: border-box;
    margin-top: 6px;
    margin-bottom: 14px;
    resize: vertical;
     -webkit-transition: all 0.30s ease-in-out;
  -moz-transition: all 0.30s ease-in-out;
  -ms-transition: all 0.30s ease-in-out;
  -o-transition: all 0.30s ease-in-out;
  outline: none;
}
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
    <center><h3><i>Ask Question</i></h3></center>
    <center><form action="AskServlet" method="post">
      <input type="text" name="uname" placeholder="Username" required>
      <input type="text" name="topic" placeholder="Enter related topic" required>
    <br>
      <textarea id="subject" name="que" placeholder="Write your Question here.." style="height:100px"></textarea>
      <br>
      <input type="submit" value="Post Question">
        </form></center>
</div>
</body>
</html>
