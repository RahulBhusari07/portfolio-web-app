package com.fileio;

import java.io.File;

public class DeleteProjectIO {
	private String result;

	public String deleteProjectFile(String filename, String realPath) {

		try {

			String path = realPath + File.separator + filename;

			File file = new File(path);
			file.delete();
			result = "DELETED";

		} catch (Exception e) {

			e.printStackTrace();
			result = "FAILED";

		}

		return result;

	}

}
