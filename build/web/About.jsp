<%-- 
    Document   : About
    Created on : Nov 16, 2018, 10:18:16 AM
    Author     : Akhilesh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<html>
    <head>
        <title>About</title> 
<meta name="viewport" content="width=device-width, initial-scale=0">
<style>
    body {
  background-image: url("blue.jpg");
}
h1{
    color:#000066;
    font-size:40px;
    font-family: "Times New Roman" ;
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
  border-radius: 8px;
}
</style>
  <%@include file="Header.jsp"%>
    <body>
        <center><h1><i>About Us</i></h1></center>
        <div class="container">
        
            <p>
                This is a Question-Answer based web application <br>
              for people who would like to gain knowledge about any topic in general.
              <br>This appplication is designed to help people who have questions regarding certain topics,<br>
              where they can easily find answers for those questions and also write their own answers too.<br> 
              Also people can register on this platform and share each other ' s<br> viewpoints regarding any topic they are interested in discussing.   
            </p>
        </div>
</body>
</html>