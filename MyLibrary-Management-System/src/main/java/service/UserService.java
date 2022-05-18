package service;

import exception.SystemException;
import Pojo.UserPojoo;

public interface UserService {

	UserPojoo addUser(UserPojoo newUserPojo) throws SystemException;

	UserPojoo validateLogin(UserPojoo newUserPojo) throws SystemException;
}
