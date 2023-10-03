<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<%@include file="./base.jsp"%>
</head>
<body>


	<div class="container mt-3">

		<h1>Add Employee Form</h1>
		<form id="yes" action="insertEmployee" method="post">

			<div class="row">
				<div class="col">
					<div class="form-group">
						<label for="name">Name</label> <input type="text"
							class="form-control" id="name" name="name"
							placeholder="Enter Name">
					</div>
				</div>
				<div class="col">
					<div class="form-group">
						<label for="designation">Designation</label> <input type="text"
							class="form-control" id="designation" name="designation"
							placeholder="Enter Designation">
					</div>
				</div>
			</div>

			<div class="row">
				<div class="col">
					<div class="form-group">
						<label for="department">Department</label> <input
							type="text" class="form-control" id="department"
							name="department" placeholder="Enter department">
					</div>
				</div>
				<div class="col">
					<div class="form-group">
						<label for="salary">Salary</label> <input type="number"
							class="form-control" id="salary" name="salary"
							placeholder="Enter Salary">
					</div>
				</div>
			</div>

			<div class="row">
				<div class="col">
					<div class="form-group">
						<label for="address">Address</label>
						<textarea class="form-control" id="address" name="address"
							rows="5" placeholder="Enter Address"> </textarea>
					</div>
				</div>
				
				
				<div class="col">
					<div class="form-group">
						<label for="password">Password</label> 
						<input type="password"
							class="form-control" id="password" name="password"
							placeholder="Enter Password" required>
					</div>
				</div>
			<div class="row">
				<div class="col">
					<div class="form-group">
						<label for="Email">Email</label>
					<input type="email"
							class="form-control" id="email" name="email"
							placeholder="Enter Email" required>
					</div>
				</div>
			</div>
			</div>

		<a href="${pageContext.request.contextPath}/"
				class="btn btn-warning"> Back </a>
			
			  <input type="submit" value="Create Account" class="btn btn-primary" onclick="alert('Register Successful')">
			
		</form>
	      
	</div>

                      


</body>
</html>