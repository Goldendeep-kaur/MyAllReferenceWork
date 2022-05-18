package dao;

import java.util.List;

import exception.EmptyCatelogException;
import exception.SystemException;
import Pojo.ReturnedBooksPojo;

public interface ReturnBooksDao {

	List<ReturnedBooksPojo>getAllReturnBooks(int userretId)throws EmptyCatelogException, SystemException;
	void returnBook(int returnBookId)throws SystemException;
	ReturnedBooksPojo getAbook(int returnBookId)throws SystemException;
}
