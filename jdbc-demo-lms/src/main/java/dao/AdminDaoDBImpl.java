package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.ArrayList;

import exception.EmptyCatelogException;
import exception.SystemException;
import model.AdminPojo;

public class AdminDaoDBImpl  implements AdminDao{

	public AdminPojo addBook(AdminPojo adminPojo) {
			Connection conn;
			try {
				conn= DBUtil.makeConnection();
				Statement stmt= conn.createStatement();
				String query= "INSERT INTO book_details(book_isbn, book_name, book_publisher, book_quantity, book_image_url)VALUES('"+adminPojo.getBookIsbn()+"','"+adminPojo.getBookName()+"','"+adminPojo.getBookPublisher()+"','"+adminPojo.getBookQuantity()+"','')";
				int rowsAffectd=stmt.executeUpdate(query);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return adminPojo;
		}

	public AdminPojo updateBook(AdminPojo adminPojo) throws SystemException {
		// TODO Auto-generated method stub
		return null;
	}

	public void deleteBook(int bookId) {
		// TODO Auto-generated method stub
		
	}

	public List<AdminPojo> getAllBooks() throws EmptyCatelogException, SystemException {
		List<AdminPojo> allBooks= new ArrayList<AdminPojo>();
		Connection conn=null;
			try {
				conn= DBUtil.makeConnection();
				Statement stmt =conn.createStatement();
				String query = "SELECT * FROM book_details";
				ResultSet resultSet = stmt.executeQuery(query);
				int counter=0;
				while(resultSet.next()) {
					counter++;
					AdminPojo adminPojo = new AdminPojo(resultSet.getInt(1),resultSet.getInt(2),resultSet.getString(3),resultSet.getString(4),resultSet.getInt(5),resultSet.getString(6));
					allBooks.add(adminPojo);
				}
				if(counter==0) {
					throw new EmptyCatelogException();
			}
			
			}
			catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		return allBooks;
	}

	public AdminPojo getABook(int bookId) throws SystemException {
		Connection conn= null;
		AdminPojo adminPojo=null;
		try {
			conn= DBUtil.makeConnection();
			Statement stmt= conn.createStatement();
			String query= "SELECT * FROM book_details WHERE book_id=bookId";
			ResultSet resultSet= stmt.executeQuery(query);
			if(resultSet.next()) {
				adminPojo= new AdminPojo(resultSet.getInt(1),resultSet.getInt(2),resultSet.getString(3),resultSet.getString(4),resultSet.getInt(5),resultSet.getString(6));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		// TODO Auto-generated method stub
		return adminPojo;
	}

}