<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="connectionfactory.connection" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%!
String url="index.jsp";
String button ="login";
%>
       <%
       String name=request.getParameter("firstname");
		String lastname =request.getParameter("lastname");
		String email =request.getParameter("email");
		String mobileno =(request.getParameter("mobileno"));
		 String password=request.getParameter("password");
		 try {
			
			int rows=connection.getdata(name, lastname, email, mobileno, password);
			if(rows>0) 
			{
				out.println("RegistrationSuccess");
				//response.sendRedirect("index.jsp");
				out.println("<a href='" + url + "'>" + button + "</a>");
				 
				
			}
			else
			{
				out.println("not success");
				RequestDispatcher rd = request.getRequestDispatcher("new.jsp");
				rd.include(request, response);
			}
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} 
           
       %>
</body>
</html>