<%-- 
    Document   : Forgot
    Created on : Nov 16, 2018, 11:02:45 AM
    Author     : Akhilesh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <head>
   <title>Verification</title>
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
    border-radius: 1px;
    background-color: white;
    padding: 10px;
    width:40%;
    margin:0 auto;
    box-shadow:3px 3px 5px 6px #ccc;
}
label
{
    color:darkgray;
}
</style>
</head>
<body>
    <%@include file="Header.jsp"%>
    <br>
    <br>
    <br>
<div class="container">
    <center><p><i>Please Answer Your Security Question</i></p></center>
    <center><form action="forgotServlet" method="post">
      <input type="text" name="uname" placeholder="Username" required>
    <br>
       <select name="que">
        <option value="q1">Security Question</option>   
      <option value="q1">What is your first school ?</option>
      <option value="q2">What is your first pet ?</option>
    </select>
    <br>
      <input type="text" name="ans" placeholder="Enter Answer" required>
      <br>
      <input type="submit" value="Verify">
        </form></center>
</div>
</body>
</html>