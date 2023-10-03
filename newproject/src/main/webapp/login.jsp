<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="connectionfactory.login" %>
    <%@ page import="java.sql.*" %>

    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

              <%
             String email =request.getParameter("email");
         	 String password=request.getParameter("password");
         	
     		 ResultSet rs = login.logindao(email, password);
     		 if(rs.next())
     		 {
     			 out.println("login succes");
     		 }
     		 else
     		 {
     			 out.println("not success");
     		 }
         			   
         			   
         		
         			  
              %>
</body>
</html>