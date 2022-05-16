package dao;

import java.util.List;

import exception.SystemException;
import model.AdminPojo;
import model.AdminViewPojo;
import model.UserPojoo;


public interface UserDao {
	UserPojoo addUser(UserPojoo newUserPojo) throws SystemException;
	UserPojoo validateLogin(UserPojoo newUserPojo)throws SystemException;
	List<AdminViewPojo> viewAllUsers() throws SystemException;
}
