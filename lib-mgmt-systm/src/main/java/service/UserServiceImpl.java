package service;

import dao.UserDao;
import dao.UserDaoImpl;
import exception.AppException;
import pojo.UserPojo;

public class UserServiceImpl implements UserService{

	
	UserDao userDao;
	
	public UserServiceImpl() {
		userDao= new UserDaoImpl();
	}

	public UserPojo createUserAccount(UserPojo userPojo) throws AppException {
		UserPojo rUserPojo= this.userDao.varifyUser(userPojo);
		
		return rUserPojo;
	}

	public UserPojo varifyUser(UserPojo userPojo) throws AppException {
		UserPojo rUserPojo= this.userDao.varifyUser(userPojo);
		
		return rUserPojo;
	}

//	public void exitApp() {
//		userDao.exitApp();
//		
//	}

}
