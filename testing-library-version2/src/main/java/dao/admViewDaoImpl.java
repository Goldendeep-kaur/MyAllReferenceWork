package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import exception.SystemException;
import model.AdminViewPojo;
import model.UserPojoo;

public class admViewDaoImpl implements AdmViewDao{

	
	public List<AdminViewPojo> getAllUsers() throws SystemException {
		
		
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

//	@Override
//	public AdminViewPojo validateLogin(AdminViewPojo admPojo) throws SystemException {
//		Connection conn=null;
//		try {
//			conn= DBUtil.makeConnection();
//			Statement stmt= conn.createStatement();
//			String query="SELECT * FROM users WHERE username="+admPojo.getUserName()+"password="+admPojo.getPassword();
//			ResultSet resultSet= stmt.executeQuery(query);
//			if(resultSet.next()) {
//				admPojo.setUserId(resultSet.getInt(1));
//				admPojo.setUserFName(resultSet.getString(2));
//				admPojo.setUserLName(resultSet.getString(3));
//				admPojo.setUserType(resultSet.getString(6));
//			}
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}return admPojo;
//	}

}
