package dao;

import exception.SystemException;
import model.ExistingUserPojo;
import model.NewUserPojo;

public interface LoginDao {
	NewUserPojo addUser(NewUserPojo newUserPojo) throws SystemException;
	ExistingUserPojo loginUser(ExistingUserPojo existingUserPojo)throws SystemException;
}
