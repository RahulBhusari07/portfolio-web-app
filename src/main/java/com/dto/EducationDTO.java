package com.dto;

public class EducationDTO {

	private String year;
	private String title;
	private String subtitle;
	private String description;

	public EducationDTO(String year, String title, String subtitle, String description) {
		super();
		this.year = year;
		this.title = title;
		this.subtitle = subtitle;
		this.description = description;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSubtitle() {
		return subtitle;
	}

	public void setSubtitle(String subtitle) {
		this.subtitle = subtitle;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
