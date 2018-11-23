import java.io.IOException;  
import java.io.PrintWriter;  
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.servlet.ServletException;  
import javax.servlet.http.HttpServlet;  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;  
import javax.servlet.http.HttpSession;  
public class ProfileServlet extends HttpServlet {  
    protected void doGet(HttpServletRequest request, HttpServletResponse response)  
                      throws ServletException, IOException {  
        response.setContentType("text/html");  
             try
    {
        String myUrl ="jdbc:mysql://localhost:3306/registerdata";
        //Step 1
        Class.forName("com.mysql.jdbc.Driver");
        //Step 2
        Connection conn =DriverManager.getConnection(myUrl,"root","");
        String query ="select First_Name,Last_Name,Age,Gender,Username,Email from register";
        //Step 3
        Statement st=conn.createStatement();
        //Step 4
        ResultSet rs=st.executeQuery(query);
        st.close();
        }
        catch(Exception e)
        {
            System.err.println("Got an exception");
             System.err.println(e.getMessage());
        }
        PrintWriter out=response.getWriter();  
        request.getRequestDispatcher("wlc.jsp").include(request, response);  
        HttpSession session=request.getSession(false);  
        if(session!=null){  
        String name=(String)session.getAttribute("name"); 
        String firstname = (String)session.getAttribute("First_Name");
        String lastname  =  (String)session.getAttribute("Last_Name");
        int Age =(int)session.getAttribute("Age");
        String Gender = (String)session.getAttribute("Gender");
        String username = (String)session.getAttribute("username");
        String Email = (String)session.getAttribute("Email");
         request.getRequestDispatcher("profile.jsp").include(request, response);   
        out.print("Hello, "+name+" Welcome to Profile");
        }  
        else{  
            out.print("<body><center><b><font color='red'>Please Login First</font></b></center></body>");
                    request.getRequestDispatcher("SignIn.jsp").include(request, response);    
        }  
        out.close();  
    }  
}  