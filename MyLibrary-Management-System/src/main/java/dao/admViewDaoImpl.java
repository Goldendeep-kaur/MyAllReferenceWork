package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import exception.SystemException;
import Pojo.AdminViewPojo;
import Pojo.UserPojoo;

public class admViewDaoImpl implements AdmViewDao {

	public List<AdminViewPojo> getAllUsers() throws SystemException {

		List<AdminViewPojo> allUsers = new ArrayList<AdminViewPojo>();
		Connection conn = null;
		try {
			conn = DBUtil.makeConnection();
			Statement stmt = conn.createStatement();
			String query = "SELECT * FROM users";
			ResultSet resultSet = stmt.executeQuery(query);
			int counter = 0;
			while (resultSet.next()) {
				counter++;
				AdminViewPojo userPojo1 = new AdminViewPojo(resultSet.getInt(1), resultSet.getString(2),
						resultSet.getString(3), resultSet.getString(4), resultSet.getString(5), resultSet.getString(6));

				allUsers.add(userPojo1);
			}
			if (counter == 0) {
				throw new SystemException();
			}

		} catch (SQLException e) {
			e.printStackTrace();
			throw new SystemException();
		}
		return allUsers;
	}

}
