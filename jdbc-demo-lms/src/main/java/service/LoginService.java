package service;

import exception.SystemException;
import model.ExistingUserPojo;
import model.NewUserPojo;

public interface LoginService {
	NewUserPojo addUser(NewUserPojo newUserPojo) throws SystemException;
	ExistingUserPojo loginUser(ExistingUserPojo existingUserPojo)throws SystemException;
}
