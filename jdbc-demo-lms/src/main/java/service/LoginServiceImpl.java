package service;

import dao.LoginDao;
import exception.SystemException;
import model.ExistingUserPojo;
import model.NewUserPojo;

public class LoginServiceImpl implements LoginService{

	LoginDao loginDao;
	
	public LoginServiceImpl() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public NewUserPojo addUser(NewUserPojo newUserPojo) throws SystemException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ExistingUserPojo loginUser(ExistingUserPojo existingUserPojo) throws SystemException {
		// TODO Auto-generated method stub
		return null;
	}

}
