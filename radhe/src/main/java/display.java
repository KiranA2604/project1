import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.protocol.Resultset;

public class display
{
	public static ResultSet displaydao(String Name,String Email,String Section,int Age) throws ClassNotFoundException, SQLException 
	{
		 String url="jdbc:mysql://localhost:3306/myntra";
		 String username1 ="root";
		 String password ="root";
		 Class.forName("com.mysql.cj.jdbc.Driver");
		 Connection con= DriverManager.getConnection(url,username1,password);
		 PreparedStatement pst = con.prepareStatement("select * from project");
		 return pst.executeQuery();
	}

}
