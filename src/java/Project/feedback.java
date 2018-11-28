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
import java.sql.Statement;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Akhilesh
 */
public class feedback extends HttpServlet {
    
    @Override
    public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException
    {
        PrintWriter out=res.getWriter();
        String firstname = req.getParameter("fname");
        String lastname = req.getParameter("lname");
        String subject= req.getParameter("subject");
        try {
            String ss="jdbc:mysql://localhost:3306/registerdata";
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection(ss,"root","");
            Statement s=con.createStatement();
                  String query="insert into Feedback values('"+firstname+"','"+lastname+"','"+subject+"')";             
                    int count=s.executeUpdate(query);
                    RequestDispatcher rd=req.getRequestDispatcher("wel.jsp");  
                    rd.include(req, res); 
                    out.print("<body><center><b><font color='blue'>Thanks for your Feedback</font></b></center></body>");
        } catch (Exception ex ) {
            ex.getMessage();
        }
    }
}