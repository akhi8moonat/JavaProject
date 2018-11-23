<%-- 
    Document   : home1
    Created on : Nov 20, 2018, 10:51:18 PM
    Author     : Akhilesh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<style>
  input[type=text]
{
    width: 30%;
    padding:10px;
    border: 1px solid #ccc;
    border-radius: 30px;
    box-sizing: border-box;
    margin-top: 6px;
    margin-bottom: 14px;
    resize: vertical;
}
input[type=submit] {
    background-color: lightseagreen;
    color: white;
    padding: 12px 20px;
    border-radius: 4px;
    border:none;
    cursor: pointer;
}
input[type=submit]:hover {
    background-color: darkseagreen;
}  
</style>
<body>
    <%@include file="Header.jsp"%>
<center><form action="SearchServlet" method="post">
        <input type="text" name="search" placeholder="Search Keywords">
        <input type="submit" value="Search">
        </form></center>
</body>