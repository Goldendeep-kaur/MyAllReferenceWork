package service;

import java.util.List;

import exception.EmptyCatelogException;
import exception.SystemException;
import Pojo.ReturnedBooksPojo;

public interface ReturnBookService {

	List<ReturnedBooksPojo>getAllReturnBooks(int userretId)throws EmptyCatelogException, SystemException;
	void returnBooks(int returnBookId) throws SystemException;
	ReturnedBooksPojo getAbook(int returnBookId)throws SystemException;
}
