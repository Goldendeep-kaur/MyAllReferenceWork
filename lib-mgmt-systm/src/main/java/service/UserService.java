package service;

import exception.AppException;
import pojo.UserPojo;

public interface UserService {
	UserPojo createUserAccount(UserPojo userPojo) throws AppException;
	UserPojo varifyUser(UserPojo userPojo) throws AppException;
	//void exitApp();
}
