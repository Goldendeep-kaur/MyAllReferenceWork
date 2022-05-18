package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import exception.EmptyCatelogException;
import exception.SystemException;
import model.BooksPojo;

public class BooksDaoImpl implements BooksDao{

	@Override
	public BooksPojo addBook(BooksPojo booksPojo) throws SystemException {
		
		Connection conn= null;
		try {
			conn= DBUtil.makeConnection();
			Statement stmt=conn.createStatement();
			String query="INSERT INTO book_details (book_isbn, book_name, book_publisher, book_quantity, book_url_image)VALUES('"+booksPojo.getBookIsbn()+"','"+booksPojo.getBookName()+"','"+booksPojo.getBookPublisher()+"','"+booksPojo.getBookQuantity()+"','') returning book_id";
			ResultSet resultSet=stmt.executeQuery(query);
			resultSet.next();
			booksPojo.setBookId(resultSet.getInt(1));
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new SystemException();
		}
		
		return booksPojo;
	}

	@Override
	public BooksPojo updateBook(BooksPojo booksPojo) throws SystemException {
		Connection conn=null;
		try {
			conn= DBUtil.makeConnection();
			Statement stmt= conn.createStatement();
			String query="UPDATE book_details SET book_quantity="+booksPojo.getBookQuantity()+"WHERE book_id="+booksPojo.getBookId();
			int rowsAffected= stmt.executeUpdate(query);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new SystemException();
		}
		return booksPojo;
	}

	@Override
	public void deleteBook(int bookId) throws SystemException {
		Connection conn= null;
		try {
			conn= DBUtil.makeConnection();
			Statement stmt=conn.createStatement();
			System.out.println("hlo");
			String query="DELETE FROM book_details WHERE book_id="+bookId;
			int rowsAffected= stmt.executeUpdate(query);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new SystemException();
		}
		
	}

	@Override
	public List<BooksPojo> getAllBooks() throws EmptyCatelogException, SystemException {
		List<BooksPojo>allBooks= new ArrayList<BooksPojo>();
		Connection conn=null;
		try {
			conn= DBUtil.makeConnection();
			Statement stmt= conn.createStatement();
			String query="SELECT * FROM book_details";
			ResultSet resultSet=stmt.executeQuery(query);
			int count=0;
			while(resultSet.next()) {
				count++;
				BooksPojo bookPojo= new BooksPojo(resultSet.getInt(1),resultSet.getInt(2),resultSet.getString(3),resultSet.getString(4),resultSet.getInt(5), resultSet.getString(6));
				allBooks.add(bookPojo);
			}
			if(count==0) {
				throw new SystemException();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new SystemException();
		}
		
		// TODO Auto-generated method stub
		return allBooks;
	}

	@Override
	public BooksPojo getABook(int bookId) throws SystemException {
		BooksPojo booksPojo=null;
		
		Connection conn=null;
		try {
			conn= DBUtil.makeConnection();
			Statement stmt=conn.createStatement();
			String query="SELECT * FROM book_details WHERE book_id="+bookId;
			ResultSet resultSet=stmt.executeQuery(query);
			if(resultSet.next()) {
				booksPojo= new BooksPojo(resultSet.getInt(1),resultSet.getInt(2),resultSet.getString(3),resultSet.getString(4),resultSet.getInt(5),resultSet.getString(6));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// TODO Auto-generated method stub
		return booksPojo;
	}

}
