/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Akhilesh
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
public class Forgotpass  
{
        public String verify(String s1,String s2) throws ClassNotFoundException, SQLException
        {
        
             String ss="jdbc:mysql://localhost:3306/registerdata";
        
            Class.forName("com.mysql.jdbc.Driver");
        
            
            Connection con = null;
        
            con = DriverManager.getConnection(ss,"root","");
        
            Statement s;
        
            s = con.createStatement();
       
            String query="select * from register where Username='"+s1+"' and answer='"+s2+"'";
            ResultSet r=s.executeQuery(query);
            while(r.next())
            {
                String u=r.getString("Username");
                String a=r.getString("answer");
                if(u.equals(s1) && a.equals(s2))
                {
                    return "login successfull";
                }
                   // out.close();
            }

            return "not verified";
        }
        public static void main(String[] args) throws ClassNotFoundException, SQLException
        {
            Forgotpass f = new Forgotpass();
            String reslut = f.verify("onm","tuv");
            System.out.println(reslut);
        }
} 