package radhe;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import connection.connectionfactory;
import connection.logindao;
import jdk.internal.org.jline.utils.Display;

@WebServlet("/hhh")

public class loginservlet extends HttpServlet {
	

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out =response.getWriter();
		String name=request.getParameter("name");
		String email = request.getParameter("email");
		
		//out.println();
		try {
		
			ResultSet rows = logindao.login(name, email);
			if(rows.next()) 
			{
				out.println("<table align='center'>"
						+"<tr>"
						+ "<th>Name</th>"
						+ "<th>Email</th>"
						+ "<th>Section</th>"
						+ "<th>Age</th>");
				while(rows.next()) 
				{
					out.println("<tr>");
					out.println("<td>"+rows.getString(1)+"</td>");
					out.println("<td>"+rows.getString(2)+"</td>");
					out.println("<td>"+rows.getString(3)+"</td>");
					out.println("<td>"+rows.getString(4)+"</td>");
					out.println("<td> <a href = 'EditServlet?age="+rows.getInt(3)+"'>Edit</a></td>");
				}
						
				
				
			}
			else
			{
				out.println("<h>login failed</h1>");
				RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
				rd.include(request, response);
				
			}
					
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
	
	
}
}
