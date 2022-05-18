package dao;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import exception.EmptyCatelogException;
import exception.SystemException;
import model.IssuBooksPojo;

public class IssueBooksDaoImpl implements IssuedBooksDao{

	

	@Override
	public IssuBooksPojo borrowBooks(IssuBooksPojo issueBooksPojo) throws SystemException {
		Connection conn=null;
		try {
			conn= DBUtil.makeConnection();
			Statement stmt=conn.createStatement();
			String query="INSERT INTO issued_books ( bid,uid,time_period,issued_date,total_books)VALUES('"+issueBooksPojo.getBookId()+"','"+issueBooksPojo.getUserId()+"','"+issueBooksPojo.getTimePeriod()+"','"+issueBooksPojo.getIssuedDate()+"','"+issueBooksPojo.getBooksTotal()+"') returning issued_id";
			
			ResultSet resultSet= stmt.executeQuery(query);
			
			resultSet.next();
			issueBooksPojo.setIssuedId(resultSet.getInt(1));
			String query2="UPDATE issued_books SET total_books= total_books+1 WHERE bid="+issueBooksPojo.getBookId();
			//int resultSet2= stmt.executeUpdate(query2);
			String query1="UPDATE book_details SET book_quantity=book_quantity-1 WHERE book_id="+issueBooksPojo.getBookId();
			//int resultSet1= stmt.executeUpdate(query1);
			
			int rowsAffectd= stmt.executeUpdate(query1);
			int rowsAffected=stmt.executeUpdate(query2);
			
			
			//resultSet1.next();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new SystemException();
		}
		
		// TODO Auto-generated method stub
		return issueBooksPojo;
	}

	@Override
	public List<IssuBooksPojo> getallIssueBooks(int userissuid) throws EmptyCatelogException, SystemException {
		
		List<IssuBooksPojo>allIssuebooks= new ArrayList<IssuBooksPojo>();
		IssuBooksPojo issueBookPojo= new IssuBooksPojo();
		
		Connection conn=null;
		try {
			conn=DBUtil.makeConnection();
			Statement stmt=conn.createStatement();
			
			String query= "SELECT * FROM issued_books WHERE uid="+userissuid;
			System.out.println(issueBookPojo.getUserId());
			ResultSet resultSet= stmt.executeQuery(query);
			
			System.out.println(query);
			int total=0;
			while(resultSet.next()) {
				total++;
				System.out.println("hello");
				IssuBooksPojo issuBookPojo=new IssuBooksPojo(resultSet.getInt(1), resultSet.getInt(2),resultSet.getInt(3),resultSet.getInt(4),resultSet.getString(5),resultSet.getInt(6));
				allIssuebooks.add(issuBookPojo);
				
				System.out.println(resultSet.getInt(1));
				System.out.println(resultSet.getInt(2));
				System.out.println(issuBookPojo.getIssuedId());
			}
			
			System.out.println(allIssuebooks.size()+"totalsize=");
			
			if(total==0) {
				throw new SystemException();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new SystemException();
		}
		// TODO Auto-generated method stub
		return allIssuebooks;
	}

}
