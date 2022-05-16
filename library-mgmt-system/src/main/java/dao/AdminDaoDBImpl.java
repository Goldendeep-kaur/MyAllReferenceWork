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

public class AdminDaoDBImpl implements AdminDao {

	public AdminPojo addBook(AdminPojo adminPojo) throws SystemException {
		Connection conn;
		try {
			conn = DBUtil.makeConnection();
			Statement stmt = conn.createStatement();
			String query = "INSERT INTO book_details(book_isbn, book_name, book_publisher, book_quantity, book_url_image)VALUES('"
					+ adminPojo.getBookIsbn() + "','" + adminPojo.getBookName() + "','" + adminPojo.getBookPublisher()
					+ "','" + adminPojo.getBookQuantity() + "','')returning book_id";
			ResultSet resultSet=stmt.executeQuery(query);
			resultSet.next();
			adminPojo.setBookId(resultSet.getInt(1));
			//int rowsAffectd = stmt.executeUpdate(query);
		} catch (SQLException e) {

			e.printStackTrace();

			throw new SystemException();
		}
		return adminPojo;
	}

	public AdminPojo updateBook(AdminPojo adminPojo) throws SystemException {
		// TODO Auto-generated method stub
		Connection conn= null;
		try {
			conn=DBUtil.makeConnection();
			Statement stmt= conn.createStatement();
			String query="UPDATE book_details SET book_quantity="+adminPojo.getBookQuantity()+"WHERE book_id="+adminPojo.getBookId();
			int rowsAffected=stmt.executeUpdate(query);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new SystemException();
		}
		return adminPojo;
	}

	public void deleteBook(int bookId) throws SystemException {
		// TODO Auto-generated method stub
		Connection conn= null;
		try {
			conn= DBUtil.makeConnection();
			Statement stmt= conn.createStatement();
			String query= "DELETE FROM book_details WHERE book_id="+bookId;
			int rowsAffected= stmt.executeUpdate(query);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new SystemException();
		}
	}

	public List<AdminPojo> getAllBooks() throws EmptyCatelogException, SystemException {
		List<AdminPojo> allBooks = new ArrayList<AdminPojo>();
		Connection conn = null;
		try {
			conn = DBUtil.makeConnection();
			Statement stmt = conn.createStatement();
			String query = "SELECT * FROM book_details";
			ResultSet resultSet = stmt.executeQuery(query);
			int counter = 0;
			while (resultSet.next()) {
				counter++;
				AdminPojo adminPojo = new AdminPojo(resultSet.getInt(1), resultSet.getInt(2), resultSet.getString(3),
						resultSet.getString(4), resultSet.getInt(5), resultSet.getString(6));
				allBooks.add(adminPojo);
			}
			if (counter == 0) {
				throw new EmptyCatelogException();
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new SystemException();
		}
		return allBooks;
	}

	public AdminPojo getABook(int bookId) throws SystemException {
		Connection conn = null;
		AdminPojo adminPojo = null;
		try {
			conn = DBUtil.makeConnection();
			Statement stmt = conn.createStatement();
			String query = "SELECT * FROM book_details WHERE book_id="+bookId;
			ResultSet resultSet = stmt.executeQuery(query);
			if (resultSet.next()) {
				adminPojo = new AdminPojo(resultSet.getInt(1), resultSet.getInt(2), resultSet.getString(3),
						resultSet.getString(4), resultSet.getInt(5), resultSet.getString(6));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new SystemException();
		} // TODO Auto-generated method stub
		return adminPojo;
	}

}
