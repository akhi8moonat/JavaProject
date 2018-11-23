/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Akhilesh
 */
public class forgotServlet extends HttpServlet {

     protected void doPost(HttpServletRequest request, HttpServletResponse response)  
                    throws ServletException, IOException {  
        response.setContentType("text/html");  
        PrintWriter out=response.getWriter();    
        String s1=request.getParameter("uname");  
        String s2=request.getParameter("ans");
        Forgotpass f = new Forgotpass();
         try {
             String result = f.verify(s1, s2);
            // out.println(result);
            if(result.equals("login successfull"))
            {
                 RequestDispatcher r=request.getRequestDispatcher("welc.jsp");  
                    r.include(request, response); 
            }
            else if(result.equals("not verified"))
            {
             RequestDispatcher r=request.getRequestDispatcher("Forgot.jsp");  
                    r.include(request, response);
              out.print("<body><center><b><font color='red'>Incorrect Details</font></b></center></body>");       
            }
         } catch (ClassNotFoundException ex) {
             Logger.getLogger(forgotServlet.class.getName()).log(Level.SEVERE, null, ex);
         } catch (SQLException ex) {
             Logger.getLogger(forgotServlet.class.getName()).log(Level.SEVERE, null, ex);
         }
         }  
}