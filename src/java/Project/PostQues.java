import java.io.*;  
import java.sql.*;  
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;  
import javax.servlet.http.*;  
  
public class PostQues extends HttpServlet {  
  
public void doPost(HttpServletRequest request, HttpServletResponse response)  
            throws ServletException, IOException {  
  
response.setContentType("text/html");  
PrintWriter out = response.getWriter();  
try{  
String ss="jdbc:mysql://localhost:3306/registerdata";
Class.forName("com.mysql.jdbc.Driver"); 
Connection con=DriverManager.getConnection(ss,"root","");  
              
PreparedStatement ps=con.prepareStatement("select * from ask");  
ResultSet rs=ps.executeQuery(); 
 RequestDispatcher rd=request.getRequestDispatcher("welcome.jsp");  
                    rd.include(request, response); 
out.println("<body><center><b><font color='red'>Questions Asked</font></b></center></body>"); 
while(rs.next())
{
            out.println(rs); 
}
}
catch (Exception e2) {}  
          
finally{out.close();}  
  
}  
}  