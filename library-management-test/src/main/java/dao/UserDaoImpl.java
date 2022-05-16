package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import exception.SystemException;
import model.UserPojoo;

public class UserDaoImpl implements UserDao {

	@Override
	public UserPojoo addUser(UserPojoo newUserPojo) throws SystemException {
		
		
		Connection conn = null;
		try {
			conn = DBUtil.makeConnection();
			Statement stmt = conn.createStatement();
			String query = "INSERT INTO users(user_fname, user_lname, username, password, user_type) VALUES('"
					+ newUserPojo.getUserFName() + "','" + newUserPojo.getUserLName() + "','"
					+ newUserPojo.getUserName() + "','" + newUserPojo.getPassword() + "','" + newUserPojo.getUserType()
					+ "')returning user_id";
			// int rowsAffected=stmt.executeUpdate(query);
			ResultSet resultSet = stmt.executeQuery(query);
			resultSet.next();
			newUserPojo.setUserId(resultSet.getInt(1));
		} catch (SQLException e) {
			throw new SystemException();
		}
		return newUserPojo;

	}

	@Override
	public UserPojoo validateLogin(UserPojoo newUserPojo) throws SystemException {
		
		Connection conn=null;
		try {
			conn= DBUtil.makeConnection();
			Statement stmt= conn.createStatement();
			String query="SELECT * FROM users WHERE username="+newUserPojo.getUserName()+"and password="+newUserPojo.getPassword();
			ResultSet resultSet= stmt.executeQuery(query);
//			if(resultSet.next()) {
//				newUserPojo.setUserId(resultSet.getInt(1));
//				newUserPojo.setUserFName(resultSet.getString(2));
//				newUserPojo.setUserLName(resultSet.getString(3));
//				newUserPojo.setUserType(resultSet.getString(6));
//				
//			}
		} catch (SQLException e) {
			throw new SystemException();
		}
		return newUserPojo;
		
	}

}
