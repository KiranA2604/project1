package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.protocol.Resultset;

public class logindao
{
	public static ResultSet login(String name,String email) throws ClassNotFoundException, SQLException
	{
	 String url="jdbc:mysql://localhost:3306/myntra";
	 String username1 ="root";
	 String password ="root";
	 Class.forName("com.mysql.cj.jdbc.Driver");
	 Connection con= DriverManager.getConnection(url,username1,password);
	 PreparedStatement pst = con.prepareStatement("select * from project where name=? and email= ?");
	 pst.setString(1, name);
	 pst.setString(2, email);
	 
	 ResultSet rs = pst.executeQuery();
	 return rs;
	 
	 
	 
}

}
