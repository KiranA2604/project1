package demo1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class pro 
{
	   public static int display(String s1, String s2) throws ClassNotFoundException, SQLException 
	   {
		   Class.forName("com.mysql.cj.jdbc.Driver");
		   Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/myntra","root","root");
		   PreparedStatement pst = con.prepareStatement("insert into vikram(name,email)values(?,?);");
		  // pst.executeUpdate();
		   pst.setString(1, s1);
		   pst.setString(2, s2);
		   int a= pst.executeUpdate();
		   return a;
		   
		   
		   
	   }

}
