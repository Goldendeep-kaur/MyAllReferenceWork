package service;

import java.util.List;

import dao.CreateUserDao;
import dao.CreateUserDaoImpl;
import exception.EmptyCatelogException;
import exception.SystemException;
import model.NewUserPojo;

public class CreateServiceImpl implements CreateUserService{

	CreateUserDao newUserDao;

	
	public CreateServiceImpl() {
		newUserDao= new CreateUserDaoImpl();
	}

	@Override
	public NewUserPojo addUser(NewUserPojo newUserPojo) throws SystemException {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<NewUserPojo> getAllUsers() throws EmptyCatelogException, SystemException {
		// TODO Auto-generated method stub
		return newUserDao.getAllUsers();
	}
//
	
//	@Override
//	public NewUserPojo viewAllBooks(NewUserPojo userPojo) throws SystemException {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public NewUserPojo viewIssuedBooks(NewUserPojo userPojo) throws SystemException {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public NewUserPojo viewReturnedBooks(NewUserPojo userPojo) throws SystemException {
//		// TODO Auto-generated method stub
//		return null;
//	}
	
}
