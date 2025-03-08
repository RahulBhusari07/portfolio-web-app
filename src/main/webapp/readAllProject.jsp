
<% 
      String logindata=(String)session.getAttribute("adminlogin");
    if(logindata==null){
    	response.sendRedirect("adminlogin.jsp");
    	return;
    }

%>













<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="com.model.ProjectFile"%>
<%@page import="java.util.List"%>
<%@page import="com.dao.readDaoimpl"%>
<%@page import="com.dao.ReadDao"%>
<%@page errorPage="error.jsp"%>



<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

</head>
<body>

	<%@include file="messageBox/printMessage.jsp"%>

	<%
                      ReadDao  readDao = new readDaoimpl();
                      List<ProjectFile> list= readDao.readProjectData();
                      for(ProjectFile  projectFile :list)
                      {
                     
                     
                   %>
	<div style="margin-bottom: 20px; text-align: center;">
		<!-- Image with gap below it -->
		<img
			style="width: 100%; height: auto; max-width: 600px; margin: 0 auto; display: block; margin-bottom: 20px;"
			src="myproject/<%=projectFile.getFilename()%>" class="img-fluid"
			alt="project image">

		<!-- Delete Project Form -->
		<form action="DeleteProjectFile" method="post"
			style="display: inline-block;">
			<input type="hidden" name="filename"
				value="<%=projectFile.getFilename()%>">
			<button type="submit"
				style="font-size: 18px; font-weight: bold; color: white; background-color: #FF6347; padding: 12px 24px; border-radius: 8px; border: none; text-decoration: none; display: inline-block; cursor: pointer; transition: background-color 0.3s ease, transform 0.2s ease; box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1); text-align: center;">
				Delete Project</button>


		</form>
	</div>





	<%} %>





</body>
</html>