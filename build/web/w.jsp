<%-- 
    Document   : Home
    Created on : Nov 16, 2018, 10:00:42 AM
    Author     : Akhilesh
--%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%
String ss = "com.mysql.jdbc.Driver";
String connectionUrl = "jdbc:mysql://localhost:3306/registerdata";
 Connection con=DriverManager.getConnection(ss,"root","");
            Statement s=con.createStatement();
            String query="select * from search";
try {
Class.forName("com.mysql.jdbc.Driver");
} catch (ClassNotFoundException e) {
e.printStackTrace();
}
Connection connection = null;
Statement statement = null;
ResultSet resultSet = null;
%>
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
h4
{
    text-align:center;
    font-family: "Times New Roman";
    color:blue;
    font-size: 20px;
}
.q
{
    background-color: white;
    width:50%;
    margin:0 auto;
}
</style>
</head>
<body>
    <%@include file="Header2.jsp"%>
    <br>
<center><form action="Search1" method="post">
        <input type="text" name="search" placeholder="Search Keywords">
         <input type="submit" value="Search">
    </form></center>
      <h4>Welcome</h4>
      <div class="q"></div>
 <div class="c1">
             <a href="welc.jsp">Feed</a>
            <a href="Tech.jsp">Technology</a>
            <a href="Sport.jsp">Sports</a>
            <a href="Health.jsp">Health</a>
            <a href="Nature.jsp">Environment</a>
            <a href="Engg.jsp">Engineering</a>
            <a href="automob.jsp">Automobiles</a>
        </div>
</html>