<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Registration Page</title>
   <!--   <script>
        // JavaScript function to validate email format
        function validateEmail(email) {
            var emailRegex = /^[A-Za-z0-9+_.-]+@(.+)$/;
            return emailRegex.test(email);
        }
        
        // JavaScript function to validate password strength
        function validatePassword(password) {
            // You can implement more complex password validation logic here
            return password.length >= 8;
        }
        function validateMobileNumber(mobileno) {
            // Regular expression to match 10-digit numeric mobile numbers
            var mobileRegex = /^\d{10}$/;
            return mobileRegex.test(mobileno);
        }
      


        
        // JavaScript function to perform client-side validation before submitting the form
        function validateForm() {
            var email = document.getElementById("email").value;
            
            var password = document.getElementById("password").value;
            var mobileno = document.getElementById("mobileno").value;
            var firstname = document.getElementById("firstname").value;
            var lastname = document.getElementById("lastname").value;
            
            
            if (!validateEmail(email)) {
                alert("Invalid email format.");
                return false;
            }
            
            if (!validatePassword(password)) {
                alert("Password must be at least 8 characters long.");
                return false;
            }
            if (!validateMobileNumber(mobileno)) {
                alert("Invalid mobile number. Please enter a 10-digit numeric mobile number.");
                return false;
            }
          
            
            return true;
        }
    </script>-->
    <style>
    body{
       margin:auto;
       	position:absolute;
       	top:50%;
       	left:50%;
       	transform: translate(-50%, -50%);
       	
       	
    }
    </style>
</head>
<body>
    <h1>Registration</h1>
    
    <form action="register.jsp" method="post" onsubmit="return validateForm();">
       <table align="center">
            <tr>
                <td>
                    <label>firstname</label>
                </td>
                <td>:</td>
                <td>
                    <input type="text" name="firstname">
                </td>
            </tr>
            <tr>
                <td>
                    <label>lastname</label>
                </td>
                <td>:</td>
                <td>
                    <input type="text" name="lastname" required>
                </td>
            </tr>
            <tr>
                 <td>
                    <label>email</label>
                </td>
                <td>:</td>
                <td>
                    <input type="email" name="email" required>
                </td>
            </tr>
            <tr>
                 <td>
                    <label>mobileno</label>
                </td>
                <td>:</td>
                <td>
                    <input type="number" name="mobileno" required>
                </td>
            </tr>
             <tr>
                 <td>
                    <label>password</label>
                </td>
                <td>:</td>
                <td>
                    <input type="password" name="password" required>
                </td>
            </tr>
        </table>
        <input type="submit" value="Register">
    </form>
</body>
</html>
