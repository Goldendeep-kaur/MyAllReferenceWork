package dao;

import java.util.List;

import exception.EmptyCatelogException;
import exception.SystemException;
import model.IssuBooksPojo;

public interface IssuedBooksDao {

	//IssuBooksPojo viewAllIssueBooks(IssuBooksPojo issueBooksPojo) throws SystemException;
	List<IssuBooksPojo>getallIssueBooks(int userissuid) throws EmptyCatelogException, SystemException;
	IssuBooksPojo borrowBooks(IssuBooksPojo issueBooksPojo)throws SystemException;
}
