import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbcInsertDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//step 1 -load driver into memory
		try {
			Class.forName("org.postgresql.Driver");
			System.out.println("Driver Loaded");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//step2-establish connection to DB
		//ConnectionURL has the protocol, ip address, port no.
		String connectionUrl = "jdbc:postgresql://localhost:5432/librarymanagementsystem";
		String userName="postgres";
		String password="Baba@1313";
		try {
			Connection conn=DriverManager.getConnection(connectionUrl, userName, password);
			System.out.println("Connection estaiblished");
			Statement stmt= conn.createStatement();
			String query="INSERT INTO book_details(book_isbn,book_name,book_publisher) VALUES(10085, 'xyzz','admin')";
			int rowsAffected=stmt.executeUpdate(query);
			System.out.println(rowsAffected+"(s) affected");
		} 
		
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//step3-create statement and execute it
		
		
		//step4- handle the exception
		
		//stmt.execute(query); boolean DDL
		//stmt.executeUpdate(query); int-row- DML
		//stmt.executeQuery(query);Resultset resultset;
		
	}

}
