
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
<title>Centered Form</title>
</head>
<body
	style="margin: 0; height: 100vh; display: flex; justify-content: center; align-items: center; background-color: #f4f4f4;">

	<%@include file="messageBox/printMessage.jsp"%>
	<a href="admin.jsp">ADMIN HOME</a>
	<hr>
	<a href="index.jsp">MAIN HOME</a>
	<hr>
	<br>
	<form action="UploadProject1" method="post"
		enctype="multipart/form-data"
		style="width: 300px; margin: 0 auto; padding: 20px; border: 1px solid #ccc; border-radius: 10px; background-color: #f9f9f9; box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);">
		<div style="margin-bottom: 15px;">
			<label for="myfile"
				style="font-size: 16px; font-weight: bold; color: #333;">Select
				File:</label><br /> <input type="file" name="myfile" id="myfile"
				style="width: 100%; padding: 8px; border: 1px solid #ddd; border-radius: 5px; font-size: 14px; color: #333;" />
		</div>
		<button type="submit"
			style="background-color: #4CAF50; color: white; padding: 10px 20px; border: none; border-radius: 5px; font-size: 16px; cursor: pointer; transition: background-color 0.3s;">
			UPLOAD</button>
	</form>




</body>
</html>