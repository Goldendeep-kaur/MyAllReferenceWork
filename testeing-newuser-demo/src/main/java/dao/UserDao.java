package dao;

import exception.SystemException;
import model.UserPojoo;


public interface UserDao {
	UserPojoo addUser(UserPojoo newUserPojo) throws SystemException;
	UserPojoo validateLogin(UserPojoo newUserPojo)throws SystemException;
}
