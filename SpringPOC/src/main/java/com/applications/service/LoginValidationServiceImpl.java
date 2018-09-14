package com.applications.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.applications.dao.LoginValidationDAO;
import com.applications.model.LoginDetails;

@Service
public class LoginValidationServiceImpl implements LoginValidationService{
	
	@Autowired
	private LoginValidationDAO validationDAO;

	@Override
	public boolean userValidation(LoginDetails details) {
		
		return validationDAO.userValidation(details);
		
	}

}
