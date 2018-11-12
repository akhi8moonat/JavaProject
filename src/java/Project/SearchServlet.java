/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Akhilesh
 */
public class SearchServlet extends HttpServlet {

     protected void doPost(HttpServletRequest request, HttpServletResponse response)  
                    throws ServletException, IOException {  
        response.setContentType("text/html");  
        PrintWriter out=response.getWriter();    
        String s=request.getParameter("search");  
        if(s.equals("Technology") || s.equals("technology") || s.equals("tech") || s.equals("Artificial Intelligence") || s.equals("Machine Learning") ){  
        RequestDispatcher r1=request.getRequestDispatcher("Tech.html");  
        r1.forward(request, response);       
        }  
        else if(s.equals("Health") || s.equals("Medicine") || s.equals("Doctor"))
        {
             RequestDispatcher r2=request.getRequestDispatcher("Health.html");  
        r2.forward(request, response);  
        }
         else if(s.equals("Sports") || s.equals("Football") || s.equals("Cricket") || s.equals("Basketball") || s.equals("Hockey") || s.equals("Tennis") || s.equals("Table Tennis") || s.equals("Badminton"))
        {
             RequestDispatcher r3=request.getRequestDispatcher("Sport.html");  
        r3.forward(request, response);  
        }
         else if(s.equals("Environment") || s.equals("Nature") || s.equals("Trees") || s.equals("Plants") || s.equals("Save Nature") || s.equals("Flowers") || s.equals("Save Trees"))
        {
        RequestDispatcher r4=request.getRequestDispatcher("Nature.html");  
        r4.forward(request, response);  
        }
        else{      
            response.setContentType("text/html");
            out.print("<body><center><b><font color='yellow'> Sorry No Results Found , Please choose from topics given below</font></b></center></body>");
        RequestDispatcher r5=request.getRequestDispatcher("topic.html");  
        r5.include(request, response);  
        }  
        out.close();  
    }  
}  
