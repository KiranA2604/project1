package connectionfactory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class connection {

	public static int getdata(String firstname,String lastname,String email,String mobileno,String password) throws ClassNotFoundException, SQLException
	{
		String url="jdbc:mysql://localhost:3306/coding";
		 String username ="root";
		 String ps ="root";
		 Class.forName("com.mysql.cj.jdbc.Driver");
		 Connection con= DriverManager.getConnection(url,username,ps);
		 
		 PreparedStatement pst = con.prepareStatement("insert into user(firstname,lastname,email,mobileno,password)values(?,?,?,?,?)");
        pst.setString(1, firstname);
        pst.setString(2, lastname);
        pst.setString(3, email);
        pst.setString(4, mobileno);
        pst.setString(5, password);
       return pst.executeUpdate();


	}

}
