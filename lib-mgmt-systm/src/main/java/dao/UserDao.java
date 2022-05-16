package dao;

import exception.AppException;
import pojo.UserPojo;

public interface UserDao {
UserPojo createUserAccount(UserPojo userPojo) throws AppException;
UserPojo varifyUser(UserPojo userPojo) throws AppException;
//void exitApp();
}
