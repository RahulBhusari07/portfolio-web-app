package com.start;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import com.dao.TableCreation;

public class StartEnd implements ServletContextListener {

	@Override
	public void contextDestroyed(ServletContextEvent sce) {

	}

	@Override
	public void contextInitialized(ServletContextEvent sce) {

		TableCreation.adminTable();
		TableCreation.projectTable();
		TableCreation.EducationTable();
		TableCreation.ContactTable();
	}

}
