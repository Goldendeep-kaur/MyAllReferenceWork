package dao;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.LogManager;

import exception.AppException;

import pojo.UserPojo;

public class UserDaoImpl implements UserDao{

	public UserPojo createUserAccount(UserPojo userPojo) throws AppException {
		Connection conn = null;
		try {
			conn = DBUtil.makeConnection();
			Statement stmt = conn.createStatement();
			String query = "INSERT INTO users(user_fname, user_lname, username, password, user_type) VALUES('"
					+ userPojo.getUserFName() + "','" + userPojo.getUserLName() + "','"
					+ userPojo.getUserName() + "','" + userPojo.getUserPassword() + "','" + userPojo.getUserType()
					+ "')returning user_id";
			// int rowsAffected=stmt.executeUpdate(query);
			ResultSet resultSet = stmt.executeQuery(query);
			resultSet.next();
			userPojo.setUserId(resultSet.getInt(1));
		} catch (SQLException e) {
			throw new AppException();
		}
		return userPojo;
	}

	public UserPojo varifyUser(UserPojo userPojo) throws AppException {
		Connection conn = null;
		try {
			conn=DBUtil.makeConnection();
			Statement stmt=conn.createStatement();
			String query=" SELECT * FROM users WHERE username="+userPojo.getUserName()+"and password="+userPojo.getUserPassword();
			ResultSet resultSet= stmt.executeQuery(query);
			if(resultSet.next()) {
				userPojo.setUserId(resultSet.getInt(1));
				userPojo.setUserFName(resultSet.getString(2));
				userPojo.setUserLName(resultSet.getString(3));
				userPojo.setUserType(resultSet.getString(6));
			}
		}catch(SQLException e) {
			throw new AppException();
		}
		return userPojo;
	}

	/*
	 * public void exitApp() {
	 * 
	 * DBUtil.closeConnection(); // TODO Auto-generated method stub
	 * 
	 * }
	 */

}
