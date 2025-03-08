package com.fileio;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;

import javax.servlet.http.Part;

public class uploadProjectio {

	private String result;

	public String write(Part part, String formattedfilename, String realPath) {

		try {

			InputStream inputStream = part.getInputStream();
			byte[] b = inputStream.readAllBytes();

			String path = realPath + File.separator + formattedfilename;

			FileOutputStream fos = new FileOutputStream(path);
			fos.write(b);
			fos.close();

			return "FILE UPLOAD SUCCESSFULLY";

		} catch (Exception e) {
			return "FILE UPLOAD FAIL";
		}

	}

}
