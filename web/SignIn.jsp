<%-- 
    Document   : SignIn
    Created on : Nov 16, 2018, 10:44:36 AM
    Author     : Akhilesh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <head>
   <title>Login</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<style>
    body {
  background-image: url("blue.jpg");
}
h3{
    color:#000066;
    font-size:30px;
    font-family: "Times New Roman" ;
}
body {font-family: Arial, Helvetica, sans-serif;}
* {box-sizing: border-box;}

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
    -webkit-transition: all 0.30s ease-in-out;
  -moz-transition: all 0.30s ease-in-out;
  -ms-transition: all 0.30s ease-in-out;
  -o-transition: all 0.30s ease-in-out;
   outline: none;
    float:none;
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
    width:30%;
    margin:0 auto;
}
label
{
    color:darkgray;
}
a{
    color:lightseagreen;
    text-decoration: none;
}
</style>
</head>
<body>
    <%@include file="Header.jsp"%>
    <br>
    <br>
    <br>
<div class="container">
    <center><h3><i>Login</i></h3></center>
    <center><form action="Session3" method="post">
      <input type="text" name="uname" placeholder="Username" required>
      <br>
    <input type="password" name="pwd" placeholder="Password" required>
      <br>
      <input type="submit" value="Login">
      <br>
      <br>
      <a href="Forgot.jsp">Forgot Password</a>
        </form></center>
</div>
</body>
</html>