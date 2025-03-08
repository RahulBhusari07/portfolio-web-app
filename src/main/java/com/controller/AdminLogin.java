package com.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.service.ReadService;
import com.service.ReadServiceimpl;

public class AdminLogin extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HttpSession session = request.getSession();

		String username = request.getParameter("username");
		String password = request.getParameter("password");

		ReadService readServiceimpl = new ReadServiceimpl();
		String result = readServiceimpl.checkAdminLoginCredentialStringService(username, password);

		if ("EXISTS".equalsIgnoreCase(result)) {
			session.setAttribute("adminlogin", username);
			response.sendRedirect("admin.jsp");
		} else {
			session.setAttribute("msg", result);
			response.sendRedirect("adminlogin.jsp");

		}

	}

}
