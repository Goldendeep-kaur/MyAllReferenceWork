package dao;


import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import exception.SystemException;
import model.ExistingUserPojo;
import model.NewUserPojo;

public class LoginDaoImpl implements LoginDao{
	
	

	@Override
	public NewUserPojo addUser(NewUserPojo newUserPojo) throws SystemException{
		Connection conn;
		try {
			conn= DBUtil.makeConnection();
			Statement stmt= conn.createStatement();
			String query="INSERT INTO users(user_fname, user_lname, username, password, user_type) VALUES('"+newUserPojo.getUserFName()+"','"+newUserPojo.getUserLName()+"','"+newUserPojo.getUserName()+"','"+newUserPojo.getPassword()+"','"+newUserPojo.getUserType()+"')";
			int rowsAffected=stmt.executeUpdate(query);
		
		} catch (SQLException e) {
			throw new SystemException();
		}
		return newUserPojo;
	}

	@Override
	public ExistingUserPojo loginUser(ExistingUserPojo existingUserPojo) throws SystemException{
		// TODO Auto-generated method stub
		return null;
	}

}
