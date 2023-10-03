package radhe;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import connection.connectionfactory;

@WebServlet("/kkk")
public class register extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out =response.getWriter();
		String name=request.getParameter("Name");
		String email = request.getParameter("Email");
		String section=request.getParameter("Section");
		
		int age =  Integer.parseInt(request.getParameter("Age"));
		
		//out.println();
		try {
		
			int rows = connectionfactory.getdata(name, email, age,section);
			if(rows>0) 
			{
				out.println("successfull");
				//RequestDispatcher rd =request.getRequestDispatcher("login.jsp");
				//rd.forward(request, response);
				response.sendRedirect("https://in.bookmyshow.com/explore/home/hyderabad");
   			}
			else
			{
				out.println("not registered");
				RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
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

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
