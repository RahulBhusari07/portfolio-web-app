<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page errorPage="error.jsp"%>








<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Login Form</title>
<style>
body {
	font-family: Arial, sans-serif;
	background-color: #f4f7fc;
	display: flex;
	justify-content: center;
	align-items: center;
	height: 100vh;
	margin: 0;
}

.login-container {
	background-color: #fff;
	border-radius: 8px;
	box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
	padding: 40px;
	width: 300px;
	text-align: center;
}

.login-container h2 {
	margin-bottom: 20px;
	color: #333;
}

input[type="text"], input[type="password"] {
	width: 100%;
	padding: 10px;
	margin: 10px 0;
	border: 1px solid #ccc;
	border-radius: 5px;
	font-size: 14px;
	box-sizing: border-box;
}

button {
	width: 100%;
	padding: 12px;
	background-color: #4CAF50;
	border: none;
	border-radius: 5px;
	color: white;
	font-size: 16px;
	cursor: pointer;
	transition: background-color 0.3s ease;
}

button:hover {
	background-color: #45a049;
}

.form-footer {
	margin-top: 20px;
	font-size: 14px;
}

.form-footer a {
	text-decoration: none;
	color: #4CAF50;
}

.form-footer a:hover {
	text-decoration: underline;
}
</style>
</head>
<body>


	<div class="login-container">


		<h2>Welcome to Admin Login</h2>

		<hr>

		<%@include file="messageBox/printMessage.jsp"%>

		<hr>

		<form action="AdminLogin" method="post">
			<label for="username">Username:</label> <input type="text"
				id="username" name="username" placeholder="Enter your Username"
				required /> <label for="password">Password:</label> <input
				type="password" id="password" name="password"
				placeholder="Enter your password" required />

			<button type="submit">LOGIN</button>
		</form>



	</div>







</body>
</html>
