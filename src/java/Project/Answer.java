/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Akhilesh
 */ 
public class Answer extends HttpServlet {
    
    @Override
    public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException
    {
        String answer= req.getParameter("ans");
        try {
            String ss="jdbc:mysql://localhost:3306/registerdata";
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection(ss,"root","");
            Statement s=con.createStatement();
              HttpSession se=req.getSession();
                String q =(String)se.getAttribute("ques");
                String u=(String)se.getAttribute("user");
                  String query="insert into answer values('"+u+"','"+q+"','"+answer+"')";             
                 int count=s.executeUpdate(query);
                 res.sendRedirect("wel.jsp");  
                // RequestDispatcher rd=req.getRequestDispatcher("wel.jsp");  
                 //rd.include(req, res);
        } catch (Exception ex ) {
            ex.getMessage();
        }
    }
}