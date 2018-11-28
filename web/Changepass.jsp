<%-- 
    Document   : Changepass
    Created on : Nov 24, 2018, 1:51:50 PM
    Author     : Akhilesh
--%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@page import="java.sql.*"%>
<%@page import="java.io.*"%>
<%
String current=request.getParameter("curr");
String Newpass=request.getParameter("new");
String Confirmpass=request.getParameter("confirm");
String connurl = "jdbc:mysql://localhost:3306/registerdata";
Connection con=null;
String pass="";
String  user="";
try{
Class.forName("com.mysql.jdbc.Driver");
con = DriverManager.getConnection(connurl, "root", "");
Statement st=con.createStatement();
ResultSet rs=st.executeQuery("select * from register where Password='"+current+"'");
while(rs.next()){
pass=rs.getString("Password");
user=rs.getString("Username");
if(pass.equals(current)){
Statement st1=con.createStatement();
int i=st1.executeUpdate("update register set Password='"+Newpass+"' where Username='"+user+"'");
response.sendRedirect("SignIn.jsp");
st1.close();
con.close();
}
else{
out.println("Invalid Current Password");
}
}
}
catch(Exception e){
out.println(e);
}
%>