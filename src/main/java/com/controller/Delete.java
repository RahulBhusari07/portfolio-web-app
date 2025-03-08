package com.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.service.DeleteService;
import com.service.DeleteServiceImpl;

public class Delete extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String id = request.getParameter("id");
		DeleteService deleteServiceImpl = new DeleteServiceImpl();
		String result = deleteServiceImpl.contactDeleteService(id);

		HttpSession session = request.getSession();
		session.setAttribute("msg", result);

		response.sendRedirect("readContact.jsp");

	}

}
