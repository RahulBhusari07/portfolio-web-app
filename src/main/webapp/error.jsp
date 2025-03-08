<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isErrorPage="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>



	<form action="error.jsp" method="post"
		style="padding: 20px; border: 2px solid #ccc; background-color: #f9f9f9;">
		<h2
			style="color: red; text-align: center; font-family: Arial, sans-serif;">SOMETHING
			WENT WRONG: WE WILL BE BACK SOON</h2>
		<%=exception%>
	</form>







</body>
</html>