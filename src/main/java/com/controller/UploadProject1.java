package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

import com.service.CreateService;
import com.service.CreateServiceimpl;

@MultipartConfig
public class UploadProject1 extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HttpSession session = request.getSession();

		Part part = request.getPart("myfile");

		String filename = part.getSubmittedFileName();

		String contentType = part.getContentType();

		long size = part.getSize();

		CreateService createServiceimpl = new CreateServiceimpl();
		String result = createServiceimpl.validateProjectFile(filename, contentType, size);

		if (result.equalsIgnoreCase("VALID")) {
			// NEXT SERVLET
			// response.sendRedirect("https://chatgpt.com/ ");--->New Request will be
			// created we are doing servlet collaboration here

			RequestDispatcher requestDispatcher = request.getRequestDispatcher("UploadProject2");
			requestDispatcher.forward(request, response);

		} else {

			session.setAttribute("msg", result);
			response.sendRedirect("uploadProject.jsp");

		}

	}

}
