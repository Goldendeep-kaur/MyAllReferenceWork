package service;

import java.util.List;

import dao.AdmViewDao;
import dao.UserDao;
import dao.UserDaoImpl;
import exception.SystemException;
import model.AdminViewPojo;
import model.UserPojoo;

public class UserServiceImpl implements UserService{

	
	UserDao userDao;
	AdmViewDao admviewDao;
	public UserServiceImpl() {
		userDao= new UserDaoImpl();
	}

	@Override
	public UserPojoo addUser(UserPojoo newUserPojo) throws SystemException {
		UserPojoo cUserPojo= this.userDao.addUser(newUserPojo);
		return cUserPojo;
	}

	@Override
	public UserPojoo validateLogin(UserPojoo newUserPojo) throws SystemException {
		//UserPojoo loginUserPojo= this.validateLogin(newUserPojo);
		
		UserPojoo loginUserPojo=this.userDao.validateLogin(newUserPojo);
		
		
		return loginUserPojo;
	}

	

}
