
<!DOCTYPE html>
<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@page import="com.model.EmployeeModel"%>
<%@page import="java.util.List"%>
<%@page import="com.dao.readDaoimpl"%>
<%@page errorPage="error.jsp"%>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
/* General Styling */
body {
	font-family: Arial, sans-serif;
	background-color: #f4f4f9;
	color: #333;
	margin: 0;
	padding: 20px;
}

h4 {
	font-size: 18px;
	color: #333;
	line-height: 1.5;
	margin: 10px 0;
}

/* Styling the links */
a {
	font-size: 16px;
	color: #4CAF50;
	text-decoration: none;
	padding: 8px;
	transition: color 0.3s ease;
}

a:hover {
	color: #2E8B57;
}

hr {
	border: 1px solid #ddd;
	margin: 20px 0;
}

/* Styling for the form and button */
form {
	margin-top: 10px;
}

button {
	font-size: 16px;
	font-weight: bold;
	color: white;
	background-color: #FF6347;
	padding: 10px 20px;
	border-radius: 5px;
	border: none;
	cursor: pointer;
	transition: background-color 0.3s ease, transform 0.3s ease;
	text-align: center;
}

button:hover {
	background-color: #e55347;
	transform: scale(1.05);
}

/* Container for each contact entry */
.contact-entry {
	background-color: white;
	padding: 15px;
	border-radius: 8px;
	box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1);
	margin-bottom: 20px;
}

/* Responsive design: Adjusting layout for smaller screens */
@media ( max-width : 768px) {
	body {
		padding: 10px;
	}
	h4 {
		font-size: 16px;
	}
	button {
		width: 100%;
		padding: 12px;
	}
}
</style>
</head>
<body>

	<!-- Check for login -->
	<% 
      String logindata = (String) session.getAttribute("adminlogin");
      if (logindata == null) {
          response.sendRedirect("adminlogin.jsp");
          return;
      }
  %>

	<%@ include file="messageBox/printMessage.jsp"%>

	<!-- Admin and Home Links -->
	<div style="margin-bottom: 20px;">
		<a href="admin.jsp">ADMIN HOME</a> | <a href="index.jsp">MAIN HOME</a>
	</div>

	<!-- Display Contact Information -->
	<%
      readDaoimpl read = new readDaoimpl();
      List<EmployeeModel> list = read.readContact();
      int sn = 1;
      for (EmployeeModel empData : list) {
  %>
	<!-- Contact Entry Container -->
	<div class="contact-entry">
		<h4>
			<strong>Sr No:</strong>
			<%= sn %></h4>
		<h4>
			<strong>NAME:</strong>
			<%= empData.getName() %></h4>
		<h4>
			<strong>EMAIL:</strong>
			<%= empData.getEmail() %></h4>
		<h4>
			<strong>MESSAGE:</strong>
			<%= empData.getMessage() %></h4>
		<h4>
			<strong>DATE & TIME:</strong>
			<%= empData.getDatetime() %></h4>

		<!-- Delete Button Form -->
		<form action="Delete" method="post">
			<input type="hidden" name="id" value="<%= empData.getId() %>">
			<button type="submit">Delete</button>
		</form>
	</div>
	<%
      sn++;
      }
  %>

</body>
</html>
