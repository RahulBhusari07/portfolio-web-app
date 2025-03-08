
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
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%@include file="messageBox/printMessage.jsp"%>


	<form action="UploadResume" method="post" enctype="multipart/form-data"
		style="text-align: center; padding: 20px;">
		<input type="file" name="myresume" style="margin-bottom: 10px;" /> <br>
		<button
			style="background-color: #4CAF50; color: white; padding: 10px 20px; border: none; cursor: pointer;">Upload/Update
			Resume</button>
	</form>









</body>
</html>