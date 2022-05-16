package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import exception.SystemException;
import model.ExistingUserPojo;
import model.NewUserPojo;

public class CreateUserDaoImpl implements CreateUserDao {

	@Override
	public NewUserPojo addUser(NewUserPojo 	newUserPojo) throws SystemException{
	Connection conn=null;
	try {
			conn= DBUtil.makeConnection();
		Statement stmt= conn.createStatement();
		String query="INSERT INTO users(user_fname, user_lname, username, password, user_type) VALUES('"+newUserPojo.getUserFName()+"','"+newUserPojo.getUserLName()+"','"+newUserPojo.getUserName()+"','"+newUserPojo.getPassword()+"','"+newUserPojo.getUserType()+"')returning user_id";
		//int rowsAffected=stmt.executeUpdate(query);
	ResultSet resultSet=stmt.executeQuery(query);
	resultSet.next();
	newUserPojo.setUserId(resultSet.getInt(1));
	} catch (SQLException e) {
			throw new SystemException();		}
		return newUserPojo;
	}

	@Override
	public NewUserPojo viewAllBooks(NewUserPojo userPojo) throws SystemException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public NewUserPojo viewIssuedBooks(NewUserPojo userPojo) throws SystemException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public NewUserPojo viewReturnedBooks(NewUserPojo userPojo) throws SystemException {
		// TODO Auto-generated method stub
		return null;
	}

//	@Override
//	public NewUserPojo addUser(NewUserPojo newUserPojo) throws SystemException {
//		// TODO Auto-generated method stub
//		return null;
//	}

}
