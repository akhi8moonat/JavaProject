package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.lang.*;
import java.sql.*;
import java.util.*;

public final class profile_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

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

      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <link href=\"//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css\" rel=\"stylesheet\" id=\"bootstrap-css\">\n");
      out.write("<script src=\"//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js\"></script>\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.7.1/jquery.min.js\"></script> \n");
      out.write("  <script type=\"text/javascript\" src=\"jquery.cycle.all.js\"></script> \n");
      out.write("       \n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Profile</title>\n");
      out.write("        <style>\n");
      out.write("          body {\n");
      out.write("  background-image: url(\"blue.jpg\");\n");
      out.write("}\n");
      out.write("\n");
      out.write(".emp-profile{\n");
      out.write("    padding: 3%;\n");
      out.write("    margin-top: 3%;\n");
      out.write("    margin-bottom: 3%;\n");
      out.write("    border-radius: 0.5rem;\n");
      out.write("    background: #fff;\n");
      out.write("}\n");
      out.write(".profile-img{\n");
      out.write("    text-align: center;\n");
      out.write("}\n");
      out.write(".profile-img img{\n");
      out.write("    width: 70%;\n");
      out.write("    height: 100%;\n");
      out.write("}\n");
      out.write(".profile-img .file {\n");
      out.write("    position: relative;\n");
      out.write("    overflow: hidden;\n");
      out.write("    margin-top: -20%;\n");
      out.write("    width: 70%;\n");
      out.write("    border: none;\n");
      out.write("    border-radius: 0;\n");
      out.write("    font-size: 15px;\n");
      out.write("    background: #212529b8;\n");
      out.write("}\n");
      out.write(".profile-img .file input {\n");
      out.write("    position: absolute;\n");
      out.write("    opacity: 0;\n");
      out.write("    right: 0;\n");
      out.write("    top: 0;\n");
      out.write("}\n");
      out.write(".profile-head h5{\n");
      out.write("    color: #333;\n");
      out.write("}\n");
      out.write(".profile-head h6{\n");
      out.write("    color: #0062cc;\n");
      out.write("}\n");
      out.write(".profile-edit-btn{\n");
      out.write("    border: none;\n");
      out.write("    border-radius: 1.5rem;\n");
      out.write("    width: 70%;\n");
      out.write("    padding: 2%;\n");
      out.write("    font-weight: 600;\n");
      out.write("    color: #6c757d;\n");
      out.write("    cursor: pointer;\n");
      out.write("}\n");
      out.write(".proile-rating{\n");
      out.write("    font-size: 12px;\n");
      out.write("    color: #818182;\n");
      out.write("    margin-top: 5%;\n");
      out.write("}\n");
      out.write(".proile-rating span{\n");
      out.write("    color: #495057;\n");
      out.write("    font-size: 15px;\n");
      out.write("    font-weight: 600;\n");
      out.write("}\n");
      out.write(".profile-head .nav-tabs{\n");
      out.write("    margin-bottom:5%;\n");
      out.write("}\n");
      out.write(".profile-head .nav-tabs .nav-link{\n");
      out.write("    font-weight:600;\n");
      out.write("    border: none;\n");
      out.write("}\n");
      out.write(".profile-head .nav-tabs .nav-link.active{\n");
      out.write("    border: none;\n");
      out.write("    border-bottom:2px solid #0062cc;\n");
      out.write("}\n");
      out.write(".profile-work{\n");
      out.write("    padding: 14%;\n");
      out.write("    margin-top: -15%;\n");
      out.write("}\n");
      out.write(".profile-work p{\n");
      out.write("    font-size: 12px;\n");
      out.write("    color: #818182;\n");
      out.write("    font-weight: 600;\n");
      out.write("    margin-top: 10%;\n");
      out.write("}\n");
      out.write(".profile-work a{\n");
      out.write("    text-decoration: none;\n");
      out.write("    color: #495057;\n");
      out.write("    font-weight: 600;\n");
      out.write("    font-size: 14px;\n");
      out.write("}\n");
      out.write(".profile-work ul{\n");
      out.write("    list-style: none;\n");
      out.write("}\n");
      out.write(".profile-tab label{\n");
      out.write("    font-weight: 600;\n");
      out.write("}\n");
      out.write(".profile-tab p{\n");
      out.write("    font-weight: 600;\n");
      out.write("    color: #0062cc;\n");
      out.write("}\n");
      out.write("            </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

        String FirstName=(String)session.getAttribute("First");
        String  LastName=(String)session.getAttribute("Last");
        String  Age=(String)session.getAttribute("age1");
        String Gender=(String)session.getAttribute("gen");
        String username=(String)session.getAttribute("uname");
         String Email=(String)session.getAttribute("mail");
           
      out.write("\n");
      out.write("       \n");
      out.write("<div class=\"container emp-profile\">\n");
      out.write("            <form method=\"post\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-md-6\">\n");
      out.write("                        <div class=\"profile-head\">\n");
      out.write("                                    \n");
      out.write("                                    \n");
      out.write("                            <ul class=\"nav nav-tabs\" id=\"myTab\" role=\"tablist\">\n");
      out.write("                                <li class=\"nav-item\">\n");
      out.write("                                    <a class=\"nav-link active\" id=\"home-tab\" data-toggle=\"tab\" href=\"#home\" role=\"tab\" aria-controls=\"home\" aria-selected=\"true\">About</a>\n");
      out.write("                                </li>\n");
      out.write("                            </ul>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"col-md-8\">\n");
      out.write("                        <div class=\"tab-content profile-tab\" id=\"myTabContent\">\n");
      out.write("                            <div class=\"tab-pane fade show active\" id=\"home\" role=\"tabpanel\" aria-labelledby=\"home-tab\">\n");
      out.write("                                        <div class=\"row\">\n");
      out.write("                                            <div class=\"col-md-6\">\n");
      out.write("                                                <label>First Name</label>\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"col-md-6\">\n");
      out.write("                                                <p>");
out.println(FirstName);
      out.write("</p>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"row\">\n");
      out.write("                                            <div class=\"col-md-6\">\n");
      out.write("                                                <label>Last Name</label>\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"col-md-6\">\n");
      out.write("                                                <p>");
out.println(LastName);
      out.write("</p>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                            <div class=\"row\">\n");
      out.write("                                            <div class=\"col-md-6\">\n");
      out.write("                                                <label>Username</label>\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"col-md-6\">\n");
      out.write("                                                <p>");
out.println(username);
      out.write("</p>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                       <div class=\"row\">\n");
      out.write("                                            <div class=\"col-md-6\">\n");
      out.write("                                                <label>Age</label>\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"col-md-6\">\n");
      out.write("                                                <p>");
out.println(Age);
      out.write("</p>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                            <div class=\"row\">\n");
      out.write("                                            <div class=\"col-md-6\">\n");
      out.write("                                                <label>Gender</label>\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"col-md-6\">\n");
      out.write("                                                <p>");
out.println(Gender);
      out.write("</p>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                            <div class=\"row\">\n");
      out.write("                                            <div class=\"col-md-6\">\n");
      out.write("                                                <label>Email</label>\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"col-md-6\">\n");
      out.write("                                                <p>");
out.println(Email);
      out.write("</p>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                <div class=\"row\">\n");
      out.write("                                    <div class=\"col-md-12\">\n");
      out.write("                                        <label>Your</label><br/>\n");
      out.write("                                        <p>Your detail description</p>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </form>           \n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("    </body>\n");
      out.write("</html>");
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
