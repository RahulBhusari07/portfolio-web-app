package com.model;

public class ProjectFile {

	private int id;
	private String filename;
	private String datetime;

	public ProjectFile(int id, String filename, String datetime) {
		super();
		this.id = id;
		this.filename = filename;
		this.datetime = datetime;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFilename() {
		return filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

	public String getDatetime() {
		return datetime;
	}

	public void setDatetime(String datetime) {
		this.datetime = datetime;
	}

}
