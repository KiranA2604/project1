package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class connectionfactory 
{
	public static int getdata(String name,String email, int age,String section) throws ClassNotFoundException, SQLException 
	{
		 String url="jdbc:mysql://localhost:3306/myntra";
		 String username ="root";
		 String password ="root";
		 Class.forName("com.mysql.cj.jdbc.Driver");
		 Connection con= DriverManager.getConnection(url,username,password);
		 PreparedStatement pst = con.prepareStatement("insert into project(name,email,age,section)values(?,?,?,?)");
		 pst.setString(1, name);
		 pst.setString(2, email);
		 
		 pst.setInt(3, age);
		 pst.setString(4, section);
		
		 return pst.executeUpdate();
		 
		 
		
		 
	}

		
}
