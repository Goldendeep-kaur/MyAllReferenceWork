package dao;

import java.util.List;

import exception.SystemException;
import Pojo.AdminViewPojo;
import Pojo.UserPojoo;

public interface AdmViewDao {

	
	List<AdminViewPojo>getAllUsers() throws SystemException;
}
