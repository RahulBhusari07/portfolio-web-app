package com.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dto.ContactDTO;
import com.service.CreateService;
import com.service.CreateServiceimpl;

public class Contact extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String message = request.getParameter("message");

		ContactDTO contactDTO = new ContactDTO(name, email, message);

		CreateService createService = new CreateServiceimpl();
		String result = createService.insertContactDTOservice(contactDTO);

		System.out.println(result);

		HttpSession session = request.getSession();
		session.setAttribute("msg", result);

		response.sendRedirect("index.jsp");

	}

}
