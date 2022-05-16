package dao;

import exception.SystemException;
import model.LoginPojo;

public interface LoginDao {
	
	
	//LoginPojo loginUser(LoginPojo loginPojo) throws SystemException;
	LoginPojo getUserId(int userId) throws SystemException;
//	LoginPojo viewBooks(LoginPojo loginPojo);
//	LoginPojo viewUsers(LoginPojo loginPojo);
//	LoginPojo viewIssuedBooks(LoginPojo loginPojo);
//	LoginPojo viewReturnedBooks(LoginPojo loginPojo);
	

}
