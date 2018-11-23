package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Ask_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/Header2.jsp");
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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("   <title>Ask Question</title>\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<style>\n");
      out.write("    body {\n");
      out.write("  background-image: url(\"blue.jpg\");\n");
      out.write("}\n");
      out.write("h3{\n");
      out.write("    color:#000066;\n");
      out.write("    font-size:25px;\n");
      out.write("    font-family: \"Times New Roman\" ;\n");
      out.write("}\n");
      out.write("body {font-family: Arial, Helvetica, sans-serif;}\n");
      out.write("* {box-sizing: border-box;}\n");
      out.write("\n");
      out.write("input[type=text],select{\n");
      out.write("    width: 40%;\n");
      out.write("    padding:12px 20px;\n");
      out.write("    border: 1px solid;\n");
      out.write("    border-color: lightgrey;\n");
      out.write("    border-radius: 18px;\n");
      out.write("    box-sizing: border-box;\n");
      out.write("    margin-top: 6px;\n");
      out.write("    margin-bottom: 14px;\n");
      out.write("    resize: vertical;\n");
      out.write("    -webkit-transition: all 0.30s ease-in-out;\n");
      out.write("  -moz-transition: all 0.30s ease-in-out;\n");
      out.write("  -ms-transition: all 0.30s ease-in-out;\n");
      out.write("  -o-transition: all 0.30s ease-in-out;\n");
      out.write("  outline: none;\n");
      out.write("}\n");
      out.write("input[type=text]:focus,input[type=password]:focus{\n");
      out.write("  box-shadow: 0 0 5px rgba(81, 203, 238, 1);\n");
      out.write("  padding: 3px 0px 3px 3px;\n");
      out.write("  margin: 5px 1px 3px 0px;\n");
      out.write("  border: 1px solid rgba(81, 203, 238, 1);\n");
      out.write("}\n");
      out.write("input[type=password]{\n");
      out.write("    width: 40%;\n");
      out.write("    padding:12px;\n");
      out.write("    border: 1px solid;\n");
      out.write("    border-color: lightgrey;\n");
      out.write("    border-radius: 18px;\n");
      out.write("    box-sizing: border-box;\n");
      out.write("    margin-top: 6px;\n");
      out.write("    margin-bottom: 14px;\n");
      out.write("    resize: vertical;\n");
      out.write("     -webkit-transition: all 0.30s ease-in-out;\n");
      out.write("  -moz-transition: all 0.30s ease-in-out;\n");
      out.write("  -ms-transition: all 0.30s ease-in-out;\n");
      out.write("  -o-transition: all 0.30s ease-in-out;\n");
      out.write("  outline: none;\n");
      out.write("}\n");
      out.write("input[type=submit] {\n");
      out.write("    background-color: lightseagreen;\n");
      out.write("    color: white;\n");
      out.write("    padding: 12px 20px;\n");
      out.write("    border-radius: 4px;\n");
      out.write("    border:12px;\n");
      out.write("    cursor: pointer;\n");
      out.write("}\n");
      out.write("\n");
      out.write("input[type=submit]:hover {\n");
      out.write("    background-color: darkcyan;\n");
      out.write("}\n");
      out.write(".container {\n");
      out.write("    border-radius: 5px;\n");
      out.write("    background-color: white;\n");
      out.write("    padding: 10px;\n");
      out.write("    width:40%;\n");
      out.write("    margin:0 auto;\n");
      out.write("}\n");
      out.write("textarea {\n");
      out.write("    width: 50%;\n");
      out.write("    padding: 12px;\n");
      out.write("    border: 1px solid #ccc;\n");
      out.write("    border-radius: 12px;\n");
      out.write("    box-sizing: border-box;\n");
      out.write("    margin-top: 6px;\n");
      out.write("    border-color: lightgrey;\n");
      out.write("    margin-bottom: 16px;\n");
      out.write("    resize: vertical;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
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
      out.write("  background-color: whitesmoke;\n");
      out.write("}\n");
      out.write("h2{\n");
      out.write("    color:#B00000;\n");
      out.write("    font-size:35px;\n");
      out.write("    text-align: center;\n");
      out.write("}\n");
      out.write(".topnav {\n");
      out.write("  overflow: hidden;\n");
      out.write("  background-color:#871F09;\n");
      out.write("}\n");
      out.write(".topnav a.logo {\n");
      out.write("  font-size: 22px;\n");
      out.write("  font-weight: bold;\n");
      out.write("}\n");
      out.write(".topnav a {\n");
      out.write("  float: left;\n");
      out.write("  color: whitesmoke;\n");
      out.write("  text-align: center;\n");
      out.write("  padding:10px 12px;\n");
      out.write("  text-decoration: none;\n");
      out.write("  font-size: 21px;\n");
      out.write("}\n");
      out.write(".topnav a:hover {\n");
      out.write("  background-color: #ff3333;\n");
      out.write("  color: white;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<div class=\"topnav\">\n");
      out.write("    <a href=\"welcome.jsp\" class=\"logo\"><font color=\"white\">QuestionMe</font></a>\n");
      out.write("  <a href=\"welcome.jsp\">Home</a>\n");
      out.write("  <a href=\"About2.jsp\">About</a>\n");
      out.write("  <a href=\"ans.jsp\">Answer</a>\n");
      out.write("  <a href=\"Contact.jsp\">Contact Us</a>\n");
      out.write("  <a href=\"Ask.jsp\">Ask Question</a>\n");
      out.write("  <a href=\"profile.jsp\">Profile</a>\n");
      out.write("  <a href=\"Session2\">Logout</a>\n");
      out.write("</div>\n");
      out.write("    \n");
      out.write("</html>");
      out.write("\n");
      out.write("    <br>\n");
      out.write("    <br>\n");
      out.write("    <br>\n");
      out.write("<div class=\"container\">\n");
      out.write("    <center><h3><i>Please Answer Your Security Question</i></h3></center>\n");
      out.write("    <center><form action=\"forgotServlet\" method=\"post\">\n");
      out.write("      <input type=\"text\" name=\"uname\" placeholder=\"Username\" required>\n");
      out.write("      <input type=\"text\" name=\"topic\" placeholder=\"Enter related topic\" required>\n");
      out.write("    <br>\n");
      out.write("      <textarea id=\"subject\" name=\"subject\" placeholder=\"Write your Question here..\" style=\"height:200px\"></textarea>\n");
      out.write("      <br>\n");
      out.write("      <input type=\"submit\" value=\"Post Question\">\n");
      out.write("        </form></center>\n");
      out.write("</div>\n");
      out.write("</body>\n");
      out.write("</html>\n");
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
