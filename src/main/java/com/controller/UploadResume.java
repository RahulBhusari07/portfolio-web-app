package com.controller;

import java.io.IOException;

import javax.servlet.ServletContext;
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
public class UploadResume extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession();
		ServletContext servletContext = getServletContext();
		String realPath = servletContext.getRealPath("myresume");

		Part part = request.getPart("myresume");

		CreateService createServiceimpl = new CreateServiceimpl();
		String result = createServiceimpl.insertResumeFile(part, realPath);

		session.setAttribute("msg", result);

		response.sendRedirect("uploadResume.jsp");

	}

}
