package com.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dto.EducationDTO;
import com.service.CreateServiceimpl;

public class AddEducation extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String year = request.getParameter("year");
		String title = request.getParameter("title");
		String subtitle = request.getParameter("subtitle");
		String description = request.getParameter("description");

		EducationDTO educationDTO = new EducationDTO(year, title, subtitle, description);
		String result = new CreateServiceimpl().insertAddEducationservice(educationDTO);

		HttpSession session = request.getSession();
		session.setAttribute("msg", result);

		response.sendRedirect("addEducation.jsp");

	}

}
