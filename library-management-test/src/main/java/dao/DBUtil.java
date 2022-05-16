package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {

	static Connection conn;
	
	static {
		try {
			//step 1
			Class.forName("org.postgresql.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	static Connection makeConnection() throws SQLException {
		//step 2
		String connectionUrl = "jdbc:postgresql://localhost:5432/librarymsystem";
		String userName = "postgres";
		String password = "Baba@1313";
		if(conn == null) {
			conn = DriverManager.getConnection(connectionUrl, userName, password);	
		}
		return conn;
	}
	
}
