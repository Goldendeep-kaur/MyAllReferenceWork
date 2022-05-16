package dao;

import exception.SystemException;
import model.NewUserPojo;

public interface CreateUserDao {

	 NewUserPojo addUser(NewUserPojo newUserPojo) throws SystemException;
	NewUserPojo viewAllBooks(NewUserPojo userPojo) throws SystemException;

	NewUserPojo viewIssuedBooks(NewUserPojo userPojo) throws SystemException;

	NewUserPojo viewReturnedBooks(NewUserPojo userPojo) throws SystemException;

}
