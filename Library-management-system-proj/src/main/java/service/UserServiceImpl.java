package service;

import dao.UserDao;
import dao.UserDaoImpl;
import exception.SystemException;
import Pojo.UserPojoo;

public class UserServiceImpl implements UserService {

	UserDao userDao;

	public UserServiceImpl() {
		userDao = new UserDaoImpl();
	}

	@Override
	public UserPojoo addUser(UserPojoo newUserPojo) throws SystemException {
		UserPojoo cUserPojo = this.userDao.addUser(newUserPojo);
		return cUserPojo;
	}

	@Override
	public UserPojoo validateLogin(UserPojoo newUserPojo) throws SystemException {
		// UserPojoo loginUserPojo= this.validateLogin(newUserPojo);
		UserPojoo loginUserPojo = this.userDao.validateLogin(newUserPojo);
		return loginUserPojo;
	}

}
