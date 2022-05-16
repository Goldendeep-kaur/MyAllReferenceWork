package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import exception.SystemException;
import model.AdminPojo;
import model.AdminViewPojo;
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
			
			System.out.println("****hello*");
			conn= DBUtil.makeConnection();
			Statement stmt= conn.createStatement();
			System.out.println("hello******************");
			String query="SELECT * FROM users WHERE username='"+newUserPojo.getUserName()+"' and password='"+newUserPojo.getPassword()+"'";
			ResultSet resultSet= stmt.executeQuery(query);
			//resultSet.next();
			if(resultSet.next()) {
				newUserPojo.setUserId(resultSet.getInt(1));
				newUserPojo.setUserFName(resultSet.getString(2));
				newUserPojo.setUserLName(resultSet.getString(3));
				newUserPojo.setUserType(resultSet.getString(6));
				
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return newUserPojo;
		
	}

	@Override
	public List<AdminViewPojo> viewAllUsers() throws SystemException {
		List<AdminViewPojo> allUsers= new ArrayList<AdminViewPojo>();
		Connection conn = null;
		try {
			conn = DBUtil.makeConnection();
			Statement stmt = conn.createStatement();
			String query = "SELECT * FROM users";
			ResultSet resultSet = stmt.executeQuery(query);
			int counter = 0;
			while (resultSet.next()) {
				counter++;
				AdminViewPojo userPojo1 = new AdminViewPojo(resultSet.getInt(1),resultSet.getString(2),resultSet.getString(3),resultSet.getString(4),resultSet.getString(5),resultSet.getString(6));
						
				allUsers.add(userPojo1);
			}
			if (counter == 0) {
				throw new SystemException();
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new SystemException();
		}
		return allUsers;
	}
	}

	


