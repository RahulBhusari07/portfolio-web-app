<!-- TOKEN CHECKING/SESSION CHECKING -->

<% 
      String logindata=(String)session.getAttribute("adminlogin");
    if(logindata==null){
    	response.sendRedirect("adminlogin.jsp");
    	return;
    }

%>






<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page errorPage="error.jsp"%>


<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Admin Panel</title>
<style>
body {
	font-family: 'Arial', sans-serif;
	background-color: #f4f4f9;
	margin: 0;
	padding: 0;
	color: #333;
}

header {
	background-color: #4CAF50;
	color: white;
	padding: 30px;
	text-align: center;
	font-size: 2.5em;
	text-transform: uppercase;
	letter-spacing: 2px;
	box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1);
}

.container {
	width: 80%;
	margin: 40px auto;
	padding: 20px;
	background-color: #fff;
	border-radius: 8px;
	box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
}

a {
	display: inline-block;
	padding: 15px 25px;
	font-size: 1.2em;
	color: #4CAF50;
	text-decoration: none;
	margin: 15px 0;
	background-color: #fff;
	border-radius: 6px;
	border: 2px solid #4CAF50;
	transition: all 0.3s ease-in-out;
	box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1);
}

a:hover {
	background-color: #4CAF50;
	color: white;
	transform: translateY(-5px);
	box-shadow: 0 4px 6px rgba(0, 0, 0, 0.2);
}

.logout-btn {
	font-size: 1.1em;
	font-weight: bold;
	color: white;
	background-color: #FF6347;
	border: none;
	border-radius: 6px;
	padding: 12px 25px;
	cursor: pointer;
	transition: all 0.3s ease;
	margin-top: 30px;
	display: inline-block;
	text-align: center;
	box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1);
}

.logout-btn:hover {
	background-color: #d9534f;
	transform: translateY(-5px);
	box-shadow: 0 4px 6px rgba(0, 0, 0, 0.2);
}

hr {
	margin: 30px 0;
	border: 0;
	border-top: 2px solid #ddd;
}

/* Subtle Fade-in Effect */
.container {
	animation: fadeIn 1s ease-out;
}

@
keyframes fadeIn { 0% {
	opacity: 0;
	transform: translateY(20px);
}

100
%
{
opacity
:
1;
transform
:
translateY(
0
);
}
}

/* Mobile responsiveness */
@media ( max-width : 768px) {
	header {
		font-size: 2em;
	}
	.container {
		width: 90%;
	}
	a {
		font-size: 1em;
		padding: 12px 20px;
	}
	.logout-btn {
		padding: 10px 20px;
	}
}
</style>
</head>
<body>

	<!-- Header Section -->
	<header> ADMIN PANEL </header>

	<!-- Main Content Section -->
	<div class="container">
		<a href="index.jsp">MAIN HOME</a>
		<hr>
		<a href="readContact.jsp">READ All CONTACTS</a>
		<hr>
		<a href="uploadProject.jsp">UPLOAD YOUR PROJECT</a>
		<hr>
		<a href="uploadResume.jsp">UPLOAD YOUR RESUME</a>
		<hr>
		<a href="addEducation.jsp">ADD YOUR EDUCATION</a>
		<hr>
		<a href="readAllProject.jsp">READ ALL YOUR PROJECT</a>

		<hr>

		<!-- Logout Form -->
		<form action="Logout" method="post">
			<button type="submit" class="logout-btn">LOGOUT</button>
		</form>
	</div>

</body>
</html>

