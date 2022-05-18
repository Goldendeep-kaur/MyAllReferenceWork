package dao;

import java.util.List;

import exception.SystemException;
import Pojo.AdminPojo;
import Pojo.AdminViewPojo;
import Pojo.UserPojoo;

public interface UserDao {
	UserPojoo addUser(UserPojoo newUserPojo) throws SystemException;

	UserPojoo validateLogin(UserPojoo newUserPojo) throws SystemException;

	List<AdminViewPojo> viewAllUsers() throws SystemException;
}
