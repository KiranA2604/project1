package connectionfactory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class login 
{
	public static ResultSet logindao(String name,String password) throws ClassNotFoundException, SQLException
	{
	 
	 String url="jdbc:mysql://localhost:3306/coding";
	 String username1 ="root";
	 String ps ="root";
	 Class.forName("com.mysql.cj.jdbc.Driver");
	 Connection con= DriverManager.getConnection(url,username1,ps);
	 PreparedStatement pst = con.prepareStatement("select * from employee1 where name=? and password= ?");
	 pst.setString(1, name);
	 pst.setString(2, password);
	 return pst.executeQuery();
	
	 
	 
	 
	 
}

}
