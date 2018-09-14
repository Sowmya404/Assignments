package com.applications.dao;

import com.applications.model.LoginDetails;

public interface LoginValidationDAO {
	
	boolean userValidation(LoginDetails details);

}
