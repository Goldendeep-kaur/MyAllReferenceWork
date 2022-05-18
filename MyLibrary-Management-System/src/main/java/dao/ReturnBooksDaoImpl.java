package dao;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import exception.EmptyCatelogException;
import exception.SystemException;
import Pojo.BooksPojo;
import Pojo.ReturnedBooksPojo;

public class ReturnBooksDaoImpl implements ReturnBooksDao {

	@Override
	public List<ReturnedBooksPojo> getAllReturnBooks(int userretId) throws EmptyCatelogException, SystemException {
		List<ReturnedBooksPojo>allReturnBooks= new ArrayList<ReturnedBooksPojo>();
		ReturnedBooksPojo returnedBooksPojo= new ReturnedBooksPojo();
		Connection conn=null;
		try {
			conn= DBUtil.makeConnection();
			Statement stmt=conn.createStatement();
			String query="SELECT * FROM return_books WHERE uid="+userretId;
			ResultSet resultSet=stmt.executeQuery(query);
			int total=0;
			while(resultSet.next()) {
				total++;
				ReturnedBooksPojo returnedbooksPojo= new ReturnedBooksPojo(resultSet.getInt(1),resultSet.getInt(2),resultSet.getInt(3),resultSet.getString(4),resultSet.getInt(5));
				allReturnBooks.add(returnedbooksPojo);
			}
			if(total==0) {
				System.out.println("You did not borrowed any book yet.");
			}
		} catch (SQLException e) {
			throw new SystemException();
		}
		return allReturnBooks;
	}

	
	

	@Override
	public void returnBook(int returnBookId) throws SystemException {
		Connection conn=null;
		BooksPojo bookPojo= new BooksPojo();
		try {
			conn= DBUtil.makeConnection();
			Statement stmt=conn.createStatement();
			String query="DELETE FROM return_books WHERE return_id="+returnBookId;
			int rowsAffectd=stmt.executeUpdate(query);
			String query1="UPDATE return_books SET books=books-1 WHERE return_id="+returnBookId;
			int rowsAffected=stmt.executeUpdate(query1);
			String query2="UPDATE book_details SET book_quantity=book_quantity+1 WHERE book_id="+bookPojo.getBookId();
			int rowsAffected1=stmt.executeUpdate(query2);
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		
	}




	@Override
	public ReturnedBooksPojo getAbook(int returnBookId) throws SystemException {
		ReturnedBooksPojo returnedBooksPojo=null;
		Connection conn=null;
		try {
			conn= DBUtil.makeConnection();
			Statement stmt=conn.createStatement();
			String query="SELECT * FROM return_books WHERE return_id="+returnBookId;
			ResultSet resultSet=stmt.executeQuery(query);
			if(resultSet.next()) {
				returnedBooksPojo= new ReturnedBooksPojo(resultSet.getInt(1),resultSet.getInt(2),resultSet.getInt(3),resultSet.getString(4),resultSet.getInt(5));
			}
		} catch (SQLException e) {
			throw new SystemException();
		}
		return returnedBooksPojo;
	}

}
