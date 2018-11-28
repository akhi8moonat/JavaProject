<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Question Me</title> 
<meta name="viewport" content="width=device-width, initial-scale=0">
<style>
body {
    margin:0;
  background-color: whitesmoke;
}
h2{
    color:#B00000;
    font-size:35px;
    text-align: center;
}
.topnav {
  overflow: hidden;
  background-color:#871F09;
}
.topnav a.logo {
  font-size: 22px;
  font-weight: bold;
}
.topnav a {
  float: left;
  color: whitesmoke;
  text-align: center;
  padding:10px 12px;
  text-decoration: none;
  font-size: 21px;
}
.topnav a:hover {
  background-color: #ff3333;
  color: white;
}
</style>
</head>
<body>
     <% response.setHeader("cache-Control","no-cache,no-store,must-revalidate");
    if(session.getAttribute("uname")==null)
    {
    response.sendRedirect("SignIn.jsp");
    }
    %>
<div class="topnav">
    <a href="wel.jsp" class="logo"><font color="white">QuestionMe</font></a>
  <a href="wel.jsp">Home</a>
  <a href="About2.jsp">About</a>
  <a href="Contact.jsp">Contact Us</a>
  <a href="Answer.jsp">Answers</a>
  <a href="Ask.jsp">Ask Question</a>
  <a href="profile.jsp">Profile</a>
  <a href="Session2">Logout</a>
</div>
    
</html>