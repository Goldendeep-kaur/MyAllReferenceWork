package dao;

import java.util.List;

import exception.SystemException;
import model.AdminViewPojo;
import model.UserPojoo;

public interface AdmViewDao {

	
	List<AdminViewPojo>getAllUsers() throws SystemException;
	//public AdminViewPojo validateLogin(AdminViewPojo admPojo) throws SystemException;
}
