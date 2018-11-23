package project ;
import java.sql.*;
import java.util.*;
//Connection->Sttement->ResultSet and Query can be executed using ExecuteQuery
//Method To return no. of rows affected executeUpdate Methodd
public class InsertSearch {
    public static void main(String [] aa) throws ClassNotFoundException, SQLException
    {
        try
        {
            Scanner ss=new Scanner(System.in);
            System.out.println("Enter Technology Keyword");
            String tech=ss.nextLine();
            System.out.println("Enter Sports Keyword");
            String sport=ss.nextLine();
             System.out.println("Enter Health Keyword");
            String health=ss.nextLine();
             System.out.println("Enter Environment Keyword");
            String nature=ss.nextLine();
             System.out.println("Enter Engineering Keyword");
            String engg=ss.nextLine();
             System.out.println("Enter Automobiles Keyword");
            String auto=ss.nextLine();
            String url="jdbc:mysql://localhost:3306/registerdata";
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn =DriverManager.getConnection(url,"root","");
            String query="insert into search values('"+tech+"','"+sport+"','"+health+"','"+nature+"','"+engg+"','"+auto+"')";
            System.out.println(query);
            Statement st=conn.createStatement();
            //ResultSet rs=st.executeQuery(query);
            int q=st.executeUpdate(query);
            if(q>0)
            {
                System.out.println("row inserted");
            }
            else
            {
                System.out.println("not inserted");
            }
            st.close();
        }
        
        catch(Exception e)
        {
            System.err.println("got an exception");
    System.err.println(e.getMessage());
        }
    }
}
