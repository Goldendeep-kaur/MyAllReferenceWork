package service;

import exception.SystemException;
import model.LoginPojo;

public interface LoginService {
	LoginPojo getUserId(int userId) throws SystemException;
}
