package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
import java.lang.*;
import java.sql.*;
import java.util.*;

public final class Home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/Header.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

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

      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("<style>\n");
      out.write("    input[type=text]\n");
      out.write("{\n");
      out.write("    width: 20%;\n");
      out.write("    padding:5px;\n");
      out.write("    border: 1px solid #ccc;\n");
      out.write("    border-radius: 30px;\n");
      out.write("    box-sizing: border-box;\n");
      out.write("    resize: vertical;\n");
      out.write("    margin-top: 5px;\n");
      out.write("    margin-left: 5px;\n");
      out.write("    margin-right: 3px;\n");
      out.write("}\n");
      out.write("input[type=submit] {\n");
      out.write("    background-color: lightcoral;\n");
      out.write("    color: white;\n");
      out.write("    padding: 8px 20px;\n");
      out.write("    border-radius: 18px;\n");
      out.write("    border:none;\n");
      out.write("    cursor: pointer;\n");
      out.write("    margin-top:5px;\n");
      out.write("    margin-right:5px;\n");
      out.write("}\n");
      out.write("input[type=submit]:hover {\n");
      out.write("    background-color: #ff3333;\n");
      out.write("    color:white;\n");
      out.write("}\n");
      out.write(".c1{\n");
      out.write("  overflow: hidden;\n");
      out.write("  background-color: white;\n");
      out.write("  width:12%;\n");
      out.write("  padding:10px;\n");
      out.write("  border:1px solid;\n");
      out.write("  border-radius:4px;\n");
      out.write("  border-color: white;\n");
      out.write("  float:left;\n");
      out.write(" box-shadow:3px 3px 4px 3px #ccc;\n");
      out.write("}\n");
      out.write(" .c1 a:hover\n");
      out.write("{\n");
      out.write("    background-color: red;\n");
      out.write("    color:white;\n");
      out.write("}\n");
      out.write(".c1 a {\n");
      out.write("    margin: 0 auto;\n");
      out.write("  display: block;\n");
      out.write("  color: grey;\n");
      out.write("  text-align: center;\n");
      out.write("  padding: 12px 14px;\n");
      out.write("  text-decoration: none;\n");
      out.write("  font-size: 18px;\n");
      out.write("  font-family: \"Times New Roman\";\n");
      out.write("  width:80%;\n");
      out.write("}\n");
      out.write("h4\n");
      out.write("{\n");
      out.write("    font-family: \"Times New Roman\";\n");
      out.write("    color:blue;\n");
      out.write("    font-size: 20px;\n");
      out.write("}\n");
      out.write("p\n");
      out.write("{\n");
      out.write("    text-align: left;\n");
      out.write("    color:grey;\n");
      out.write("    font-family: \"Times New Roman\";\n");
      out.write("    font-size:18px;\n");
      out.write("}\n");
      out.write(".q\n");
      out.write("{\n");
      out.write("    background-color: white;\n");
      out.write("    width:50%;\n");
      out.write("    margin:0 auto;\n");
      out.write("    text-align:left;\n");
      out.write("    box-shadow:3px 2px 3px 2px #ccc;\n");
      out.write("}\n");
      out.write("h3\n");
      out.write("{\n");
      out.write(" color:black;\n");
      out.write(" font-family: \"Times New Roman\";\n");
      out.write(" font-size:20px;\n");
      out.write("}\n");
      out.write("a\n");
      out.write("{\n");
      out.write("    text-decoration: none;\n");
      out.write("    color:grey;\n");
      out.write("    font-size:15px;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("    </head>\n");
      out.write("    ");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Question Me</title> \n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=0\">\n");
      out.write("<style>\n");
      out.write("body {\n");
      out.write("    margin:0;\n");
      out.write("}\n");
      out.write("h2{\n");
      out.write("    color:#B00000;\n");
      out.write("    font-size:35px;\n");
      out.write("    text-align: center;\n");
      out.write("}\n");
      out.write(".topnav {\n");
      out.write("  overflow: hidden;\n");
      out.write("  background-color:white;\n");
      out.write("   box-shadow: 0 8px 6px -6px #ccc;\n");
      out.write("}\n");
      out.write(".topnav a.logo {\n");
      out.write("  font-size: 22px;\n");
      out.write("  font-weight: bold;\n");
      out.write("}\n");
      out.write(".topnav a {\n");
      out.write("  float: left;\n");
      out.write("  color: black;\n");
      out.write("  text-align: center;\n");
      out.write("  padding:10px 12px;\n");
      out.write("  text-decoration: none;\n");
      out.write("  font-size: 21px;\n");
      out.write("}\n");
      out.write(".topnav a:hover {\n");
      out.write("  background-color: red;\n");
      out.write("  color: white;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<div class=\"topnav\">\n");
      out.write("    <a href=\"Home.jsp\" class=\"logo\"><font color=\"red\">QuestionMe</font></a>\n");
      out.write("  <a href=\"Home.jsp\">Home</a>\n");
      out.write("  <a href=\"About.jsp\">About</a>\n");
      out.write("  <a href=\"ContactUs.jsp\">Contact Us</a>\n");
      out.write("  <a href=\"Signup.jsp\">Register</a>\n");
      out.write("  <a href=\"SignIn.jsp\">Login</a>\n");
      out.write("</div>\n");
      out.write("    \n");
      out.write("</html>");
      out.write(" \n");
      out.write("<body>\n");
      out.write("    <br>\n");
      out.write("<center><form action=\"Search1\" method=\"post\">\n");
      out.write("        <input type=\"text\" name=\"search\" placeholder=\"Search Keywords\">\n");
      out.write("         <input type=\"submit\" value=\"Search\">\n");
      out.write("    </form></center>\n");
      out.write(" <div class=\"c1\">\n");
      out.write("             <a href=\"Home.jsp\">Feed</a>\n");
      out.write("            <a href=\"Tech.jsp\">Technology</a>\n");
      out.write("            <a href=\"Sport.jsp\">Sports</a>\n");
      out.write("            <a href=\"Health.jsp\">Health</a>\n");
      out.write("            <a href=\"Nature.jsp\">Environment</a>\n");
      out.write("            <a href=\"Engg.jsp\">Engineering</a>\n");
      out.write("            <a href=\"automob.jsp\">Automobiles</a>\n");
      out.write("        </div>\n");

try{ 
con = DriverManager.getConnection(conUrl,"root", "");
statement=con.createStatement();
String sql ="select * from ask";
r = statement.executeQuery(sql);
while(r.next()){

      out.write("\n");
      out.write("<div class=\"q\">\n");
      out.write("<p>");
out.println(r.getString("Username"));
      out.write("     ");
out.println(r.getString("Topic"));
      out.write("</p>\n");
      out.write("<h3>");
out.println(r.getString("Question"));
      out.write("</h3>\n");
      out.write("<a href=\"SignIn.jsp\">Write an Answer</a>\n");
      out.write("</div>\n");

}

      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");

}
catch(Exception ex) 
{
    ex.getMessage();
}

    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
