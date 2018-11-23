<%-- 
    Document   : Home
    Created on : Nov 16, 2018, 10:00:42 AM
    Author     : Akhilesh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<style>
    input[type=text]
{
    width: 20%;
    padding:5px;
    border: 1px solid #ccc;
    border-radius: 30px;
    box-sizing: border-box;
    resize: vertical;
    margin-top: 5px;
    margin-left: 5px;
    margin-right: 3px;
}
input[type=submit] {
    background-color: lightcoral;
    color: white;
    padding: 8px 20px;
    border-radius: 18px;
    border:none;
    cursor: pointer;
    margin-top:5px;
    margin-right:5px;
}
input[type=submit]:hover {
    background-color: #ff3333;
    color:white;
}
.c1{
  overflow: hidden;
  background-color: white;
  width:12%;
  padding:10px;
  border:1px solid;
  border-radius:4px;
  border-color: white;
  float:left;
}
 .c1 a:hover
{
    background-color: lightcoral;
    color:white;
}
.c1 a {
    margin: 0 auto;
  display: block;
  color: grey;
  text-align: center;
  padding: 12px 14px;
  text-decoration: none;
  font-size: 18px;
  font-family: "Times New Roman";
  width:80%;
}
</style>
</head>
<body>
    <%@include file="Header.jsp"%>
    <br>
<center><form action="Search1" method="post">
        <input type="text" name="search" placeholder="Search Keywords">
         <input type="submit" value="Search">
    </form></center>
 <div class="c1">
             <a href="Home.jsp">Feed</a>
            <a href="Tech.jsp">Technology</a>
            <a href="Sport.jsp">Sports</a>
            <a href="Health.jsp">Health</a>
            <a href="Nature.jsp">Environment</a>
            <a href="Engg.jsp">Engineering</a>
            <a href="automob.jsp">Automobiles</a>
        </div>
</html>