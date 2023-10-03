package register;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import connectionfactory.connection;

@WebServlet("/kkk")
public class registerservlet extends HttpServlet {
	
     
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out =response.getWriter();
		out.println("helloo");
		String name=request.getParameter("firstname");
		String lastname =request.getParameter("lastname");
		String email =request.getParameter("email");
		String mobileno =(request.getParameter("mobileno"));
		 String password=request.getParameter("password");
		 try {
			
			int rows=connection.getdata(name, lastname, email, mobileno, password);
			if(rows>0) 
			{
				out.println("success");
				
				
			}
			else
			{
				out.println("not success");
			}
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}

}
