<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html"%>
<%@page import="java.lang.*"%>
<%@page import="java.sql.*"%>
<%@page import="java.util.*" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
String driverName = "com.mysql.jdbc.Driver";
String conUrl = "jdbc:mysql://localhost:3306/registerdata";
try {
Class.forName(driverName);
} catch (ClassNotFoundException e) {
e.printStackTrace();
}

Connection con = null;
Statement statement = null;
ResultSet r = null;
%>
<html>
    <head>
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
  box-shadow:3px 3px 4px 3px #ccc;
}
 .c1 a:hover
{
    background-color: red;
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
    font-family: "Times New Roman";
    color:blue;
    font-size: 20px;
    text-align:center;
}
p
{
    text-align: left;
    color:grey;
    font-family: "Times New Roman";
    font-size:18px;
}
.q
{
    background-color: white;
    width:50%;
    margin:0 auto;
    text-align:left;
    box-shadow:3px 2px 3px 2px #ccc;
}
h3
{
 color:black;
 font-family: "Times New Roman";
 font-size:20px;
}
a
{
    text-decoration: none;
    color:grey;
    font-size:15px;
}
</style>
    </head>
    <%@include file="Header2.jsp"%> 
<body>
    <br>
<center><form action="Search2" method="post">
        <input type="text" name="search" placeholder="Search Keywords">
         <input type="submit" value="Search">
    </form></center>
<br>
<h4>Welcome ${uname}</h4>
<br>
 <div class="c1">
             <a href="wel.jsp">Feed</a>
            <a href="Tech2.jsp">Technology</a>
            <a href="Sport2.jsp">Sports</a>
            <a href="Health2.jsp">Health</a>
            <a href="Nature2.jsp">Environment</a>
            <a href="Engg2.jsp">Engineering</a>
            <a href="automob2.jsp">Automobiles</a>
        </div>
<%
try{ 
con = DriverManager.getConnection(conUrl,"root", "");
statement=con.createStatement();
String sql ="select * from ask";
r = statement.executeQuery(sql);
while(r.next()){
%>
<div class="q">
<p><%out.println(r.getString("Username"));%>     <%out.println(r.getString("Topic"));%></p>
<h3><%out.println(r.getString("Question"));%></h3>
<a href="ans.jsp">Write an Answer</a>
</div>
<%
}
%>
</body>
</html>
<%
}
catch(Exception ex) 
{
    ex.getMessage();
}
%>