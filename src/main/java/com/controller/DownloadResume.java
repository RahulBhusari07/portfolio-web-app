package com.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DownloadResume extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// file inpute stream --> get the real path file
		// byte array actual file taken out
		// browser then write the file (response) to make it available to download

		String realPath = getServletContext().getRealPath("myresume");

		FileInputStream fis = new FileInputStream(realPath + File.separator + "RahulBhusari.pdf");
		byte[] b = fis.readAllBytes();

		ServletOutputStream out = response.getOutputStream();

		response.setHeader("content-disposition", "filename=Rahul_B_Resume.pdf");

		response.setContentType("application/octet-stream");

		out.write(b);
	}

}
