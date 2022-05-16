package dao;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import exception.SystemException;
import model.LoginPojo;

public class LoginDaoImpl implements LoginDao{

	@Override
	public LoginPojo getUserId(int userId) throws SystemException {
		
		
		
		Connection conn=null;
		LoginPojo loginPojoo=null;
		try {
			conn=DBUtil.makeConnection();
			Statement stmt= conn.createStatement();
			String query="SELECT username,password, user_type FROM users WHERE user_id="+userId;
			ResultSet resultSet= stmt.executeQuery(query);
			if(resultSet.next()) {
				loginPojoo= new LoginPojo(resultSet.getString(4),resultSet.getString(5),resultSet.getInt(6));
		
		} 
		}catch (SQLException e) {
			throw new SystemException();
		}
		return loginPojoo;
		
	}

	public LoginDaoImpl() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	

	



}
