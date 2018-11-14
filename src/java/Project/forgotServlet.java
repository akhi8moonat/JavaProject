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
        try
        {
             String ss="jdbc:mysql://localhost:3306/registerdata";
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection(ss,"root","");
            Statement s=con.createStatement();
            String query="select * from register where question='"+s1+"' and answer='"+s2+'"';
            ResultSet r=s.executeQuery(query);
            while(r.next())
            {
                String u=r.getString("Username");
                String a=r.getString("answer");
                if(u.equals(s1) && a.equals(s2))
                {
            RequestDispatcher rd=request.getRequestDispatcher("welc.html");  
            rd.forward(request, response);      
        }
                   // out.close();
            }
            out.print("<body><center><b><font color='red'>Incorrect Details Entered</font></b></center></body>");
                    RequestDispatcher rd=request.getRequestDispatcher("Forgot.html");  
                    rd.include(request, response);    
                    //response.sendRedirect("Login.html");
        } catch (Exception ex) {
               
         }      
    } 
         }  
