package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import exception.EmptyCatelogException;
import exception.SystemException;
//import model.ExistingUserPojo;
import model.NewUserPojo;

public class CreateUserDaoImpl implements CreateUserDao {

	@Override
	public NewUserPojo addUser(NewUserPojo newUserPojo) throws SystemException {
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
	public List<NewUserPojo> getAllUsers() throws EmptyCatelogException, SystemException {
		// TODO Auto-generated method stub
		List<NewUserPojo>allUsers= new ArrayList<NewUserPojo>();
		Connection conn=null;
		try {
			conn= DBUtil.makeConnection();
			Statement stmt=conn.createStatement();
			String query="SELECT * FROM users:";
			ResultSet resultSet=stmt.executeQuery(query);
			int counter=0;
			while(resultSet.next()) {
				counter++;
				NewUserPojo newUserPojo= new NewUserPojo(resultSet.getInt(1), resultSet.getString(2),resultSet.getString(3),resultSet.getString(4),resultSet.getString(5),resultSet.getInt(6));
				allUsers.add(newUserPojo);
			}
			if(counter==0) {
				throw new EmptyCatelogException();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			throw new SystemException();
		}
		return allUsers;
	}

//	@Override
//	public NewUserPojo viewAllBooks(NewUserPojo userPojo) throws SystemException {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public NewUserPojo viewIssuedBooks(NewUserPojo userPojo) throws SystemException {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public NewUserPojo viewReturnedBooks(NewUserPojo userPojo) throws SystemException {
//		// TODO Auto-generated method stub
//		return null;
//	}

//	@Override
//	public NewUserPojo addUser(NewUserPojo newUserPojo) throws SystemException {
//		// TODO Auto-generated method stub
//		return null;
//	}

}
