<%-- 
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

	<%@ include file="messageBox/printMessage.jsp"%>

	<div style="margin-bottom: 20px;">
		<a href="admin.jsp"
			style="text-decoration: none; color: #007BFF; font-weight: bold;">ADMIN
			HOME</a> | <a href="index.jsp"
			style="text-decoration: none; color: #007BFF; font-weight: bold;">MAIN
			HOME</a>
	</div>

	<form action="AddEducation" method="post"
		style="display: flex; flex-direction: column; gap: 10px; animation: fadeIn 1s ease-in;">
		<input type="text" name="year" placeholder="Enter your year"
			style="padding: 8px; border-radius: 5px; border: 1px solid #ccc; opacity: 0; animation: fadeIn 1s ease-in 0.5s forwards;" />
		<input type="text" name="title" placeholder="Enter your title"
			style="padding: 8px; border-radius: 5px; border: 1px solid #ccc; opacity: 0; animation: fadeIn 1s ease-in 0.6s forwards;" />
		<input type="text" name="subtitle" placeholder="Enter your subtitle"
			style="padding: 8px; border-radius: 5px; border: 1px solid #ccc; opacity: 0; animation: fadeIn 1s ease-in 0.7s forwards;" />
		<input type="text" name="description"
			placeholder="Enter your description"
			style="padding: 8px; border-radius: 5px; border: 1px solid #ccc; opacity: 0; animation: fadeIn 1s ease-in 0.8s forwards;" />
		<button
			style="padding: 10px 15px; background-color: #4CAF50; color: white; border: none; border-radius: 5px; opacity: 0; animation: fadeIn 1s ease-in 0.9s forwards;">Add
			Education</button>
	</form>

	<style>
@
keyframes fadeIn {from { opacity:0;
	
}

to {
	opacity: 1;
}

}

/* Added hover effect for links */
a:hover {
	color: #0056b3;
	text-decoration: underline;
}
</style>







</body>
</html> --%>






<%
    // Debugging session attribute
    String logindata = (String) session.getAttribute("adminlogin");
    System.out.println("Admin Login Data: " + logindata);

    if (logindata == null) {
        response.sendRedirect("adminlogin.jsp");
        return;
    }
%>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%-- Temporarily removing errorPage to catch issues directly --%>
<%-- <%@page errorPage="error.jsp"%> --%> 
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Admin - Add Education</title>
    <style>
        @keyframes fadeIn {
            from { opacity: 0; }
            to { opacity: 1; }
        }

        /* Ensure elements are visible */
        input, button {
            padding: 8px;
            border-radius: 5px;
            border: 1px solid #ccc;
            animation: fadeIn 1s ease-in;
            opacity: 1; /* Fix: Ensuring visibility */
        }

        button {
            background-color: #4CAF50;
            color: white;
            border: none;
            padding: 10px 15px;
            cursor: pointer;
        }

        button:hover {
            background-color: #45a049;
        }

        /* Added hover effect for links */
        a {
            text-decoration: none;
            color: #007BFF;
            font-weight: bold;
        }

        a:hover {
            color: #0056b3;
            text-decoration: underline;
        }
    </style>
</head>
<body>

    <%-- Temporarily commenting this out to check if it's causing issues --%>
   <%@ include file="messageBox/printMessage.jsp"%>

    <div style="margin-bottom: 20px;">
        <a href="admin.jsp">ADMIN HOME</a> | 
        <a href="index.jsp">MAIN HOME</a>
    </div>

    <form action="AddEducation" method="post" style="display: flex; flex-direction: column; gap: 10px;">
        <input type="text" name="year" placeholder="Enter your year" />
        <input type="text" name="title" placeholder="Enter your title" />
        <input type="text" name="subtitle" placeholder="Enter your subtitle" />
        <input type="text" name="description" placeholder="Enter your description" />
        <button type="submit">Add Education</button>
    </form>

</body>
</html>
