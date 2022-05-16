package dao;

import java.util.List;

import exception.EmptyCatelogException;
import exception.SystemException;
import model.NewUserPojo;

public interface CreateUserDao {

	 NewUserPojo addUser(NewUserPojo newUserPojo) throws SystemException;
	 List<NewUserPojo>getAllUsers()throws EmptyCatelogException, SystemException;
	//NewUserPojo viewAllBooks(NewUserPojo userPojo) throws SystemException;

	//NewUserPojo viewIssuedBooks(NewUserPojo userPojo) throws SystemException;

	//NewUserPojo viewReturnedBooks(NewUserPojo userPojo) throws SystemException;

}
