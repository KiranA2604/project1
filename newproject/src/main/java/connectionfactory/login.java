package connectionfactory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.protocol.Resultset;
import com.mysql.cj.xdevapi.Result;

public class login
{
	public static ResultSet logindao(String email,String password) throws ClassNotFoundException, SQLException
	{
	 
	 String url="jdbc:mysql://localhost:3306/coding";
	 String username1 ="root";
	 String ps ="root";
	 Class.forName("com.mysql.cj.jdbc.Driver");
	 Connection con= DriverManager.getConnection(url,username1,ps);
	 PreparedStatement pst = con.prepareStatement("select * from user where email=? and password= ?");
	 pst.setString(1, email);
	 pst.setString(2, password);
	 return pst.executeQuery();
	
	 
	 
	 
	 
}
}

