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
    <title>Answers</title>
    <style>
        body{
            background-image: url("blue.jpg");
            background-repeat: no-repeat;
        }
        h4{
            color:#000066;
            font-size:30px;
            text-align: center;
            font-family:"Times New Roman";
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
    <%@include file="Header2.jsp"%>
    <body>
        <h4><i>Answers to Questions Asked</i></h4>
   <%
try{ 
con = DriverManager.getConnection(conUrl,"root", "");
statement=con.createStatement();
String sql ="SELECT * FROM answer";
r = statement.executeQuery(sql);
while(r.next()){
%>
<div class="q">
    <p><%out.println(r.getString("Username"));%></p>
<h3><%out.println(r.getString("Question"));%></h3>
<p>Answer:</p>
<h3><%out.println(r.getString("Answer"));%></h3>
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