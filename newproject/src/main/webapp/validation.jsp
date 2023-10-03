<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%!
private boolean isValidEmail(String email) {
    // Implement email validation logic (e.g., checking if it's unique)
    // Return true if valid, false otherwise
    return true; // Placeholder value
}
private boolean isValidPassword(String password) {
    // Implement password validation logic (e.g., length, complexity)
    // Return true if valid, false otherwise
    return password.length() >= 8; // Placeholder value
}
private boolean isValidMobile(String mobileno) {
    // Implement password validation logic (e.g., length, complexity)
    // Return true if valid, false otherwise
    return mobileno.length() == 10; // Placeholder value
}



%>
              <%
            
                      // Get user input from the registration form
                      String email = request.getParameter("email");
                      String password = request.getParameter("password");
                      String mobileno =request.getParameter("mobileno");
                      String firstname = request.getParameter("firstname");
                      String lastname = request.getParameter("lastname");
                      

                      // Perform server-side validation
                      if (!isValidEmail(email)) {
                          response.sendRedirect("new.jsp?error=email");
                          return;
                      }

                      if (!isValidPassword(password)) {
                          response.sendRedirect("new.jsp?error=password");
                          return;
                      }
                      if (!isValidMobile(mobileno)) {
                          response.sendRedirect("new.jsp?error=mobileno");
                          return;
                      }
                   
                    
                      response.sendRedirect("register.jsp");
                      

                  
              

              %>
</body>
</html>