package service;

import java.util.List;

import exception.EmptyCatelogException;
import exception.SystemException;
import model.AdminPojo;
import model.AdminViewPojo;
import model.UserPojoo;

public interface UserService {

	UserPojoo addUser(UserPojoo newUserPojo) throws SystemException;
	UserPojoo validateLogin(UserPojoo newUserPojo)throws SystemException;
	//List<AdminViewPojo> getAllUsers() throws SystemException;
}

