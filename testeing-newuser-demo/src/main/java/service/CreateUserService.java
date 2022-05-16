package service;

import java.util.List;

import exception.EmptyCatelogException;
import exception.SystemException;
import model.NewUserPojo;

public interface CreateUserService {


	NewUserPojo addUser(NewUserPojo newUserPojo) throws SystemException;
	List<NewUserPojo>getAllUsers()throws EmptyCatelogException, SystemException;
//	NewUserPojo viewAllBooks(NewUserPojo userPojo) throws SystemException;
//	NewUserPojo viewIssuedBooks(NewUserPojo userPojo) throws SystemException;
//	NewUserPojo viewReturnedBooks(NewUserPojo userPojo) throws SystemException;
}
