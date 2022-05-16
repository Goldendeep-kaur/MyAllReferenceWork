package dao;

import java.util.List;

import exception.EmptyCatelogException;
import exception.SystemException;
import model.NewUserPojo;

public interface CreateUserDao {

	 NewUserPojo addUser(NewUserPojo newUserPojo) throws SystemException;
	 //NewUserPojo viewAllUsers(NewUserPojo userPojo) throws SystemException;

	 List<NewUserPojo>getAllUsers()throws EmptyCatelogException, SystemException;
	//NewUserPojo viewIssuedBooks(NewUserPojo userPojo) throws SystemException;

	//NewUserPojo viewReturnedBooks(NewUserPojo userPojo) throws SystemException;

}
