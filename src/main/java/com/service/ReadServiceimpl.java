package com.service;

import com.dao.ReadDao;
import com.dao.readDaoimpl;
import com.vaidations.AdminLoginValidations;

public class ReadServiceimpl implements ReadService {

	private String result;

	@Override
	public String checkAdminLoginCredentialStringService(String username, String password) {

		AdminLoginValidations ad = new AdminLoginValidations();
		result = ad.validateCredential(username, password);

		if ("VALID".equals(result)) {
			// DAO
			ReadDao readDaoimpl = new readDaoimpl();

			return readDaoimpl.readAdminLoginCredentials(username, password);

		} else {
			return result;

		}

	}

}
