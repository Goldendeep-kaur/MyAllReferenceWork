package Dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import model.LibraryPojo;

public class LibraryDaoDatabaseImpl implements LibraryDao {

	@Override
	public LibraryPojo addBooks(LibraryPojo libraryPojo) {
		// TODO Auto-generated method stub
		Connection conn;
		try {
			conn=DBUtil.makeConnection();
			Statement stmt= conn.createStatement();
			String query= "INSERT INTO book_details(book_isbn, book_name, book_publisher, book_image_url)VALUES('"+libraryPojo.getBookIsbn()+"','"+libraryPojo.getBookName()+"','"+libraryPojo.getBookPublisher()+"','')";
			int rowsAffectd=stmt.executeUpdate(query);
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return libraryPojo;
	}

	@Override
	public LibraryPojo updateBook(LibraryPojo libraryPojo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteBook(int bookId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<LibraryPojo> getAllBooks() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public LibraryPojo getABook(int bookId) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
