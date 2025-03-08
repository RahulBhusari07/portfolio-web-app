package com.fileio;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;

import javax.servlet.http.Part;

public class UploadResumeIO {

	private String result;

	public String writeResume(Part part, String realPath) {

		try {
			InputStream inputStream = part.getInputStream();
			byte[] b = inputStream.readAllBytes();

			FileOutputStream fos = new FileOutputStream(realPath + File.separator + "RahulBhusari.pdf");

			fos.write(b);
			fos.close();

			result = "RESUME UPLOAD SUCCESSFUL";

		} catch (Exception e) {
			e.printStackTrace();
			result = "RESUME UPLOAD FAILED : FILE IO ISSUE";

		}

		return result;

	}

}
