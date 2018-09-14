package com.applications.dao;

import org.springframework.stereotype.Repository;

import com.applications.model.LoginDetails;

@Repository
public class LoginValidationDAOImpl implements LoginValidationDAO {

	@Override
	public boolean userValidation(LoginDetails details) {

		boolean result = false;

		if (details.getUserName() != null) {
			if (details.getPassword() != null
					&& details.getPassword().equals("P@$$W0rd")) {
				result = true;
			}
		}
		return result;
	}

}
