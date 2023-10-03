package demo1;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class fds implements Servlet
{

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void init(ServletConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		 res.setContentType("text/html");
		 PrintWriter pw = res.getWriter();
		 pw.println("hiiiiiiii");
		 String s =req.getParameter("name");
		 String s1 =req.getParameter("email");
		 try {
			pro.display(s, s1);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
	
		}
		 pw.println(s);
		 pw.println(s1);
		 
		 
		 
		
	}
	
	 
}
	
	

