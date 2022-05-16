package service;

import exception.SystemException;
import model.NewUserPojo;

public interface CreateUserService {


	NewUserPojo addUser(NewUserPojo newUserPojo) throws SystemException;
	NewUserPojo viewAllBooks(NewUserPojo userPojo) throws SystemException;
	NewUserPojo viewIssuedBooks(NewUserPojo userPojo) throws SystemException;
	NewUserPojo viewReturnedBooks(NewUserPojo userPojo) throws SystemException;
}
