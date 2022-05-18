package service;

import java.util.List;

import dao.ReturnBooksDao;
import dao.ReturnBooksDaoImpl;
import exception.EmptyCatelogException;
import exception.SystemException;
import model.ReturnedBooksPojo;

public class ReturnBookServiceImpl implements ReturnBookService{

	ReturnBooksDao retBooksDao;
	int userretId;
	
	
	
	public ReturnBookServiceImpl() {
		retBooksDao= new ReturnBooksDaoImpl();
	}
	
	

	public ReturnBooksDao getRetBooksDao() {
		return retBooksDao;
	}



	public void setRetBooksDao(ReturnBooksDao retBooksDao) {
		this.retBooksDao = retBooksDao;
	}



	public int getUserretId() {
		return userretId;
	}



	public void setUserretId(int userretId) {
		this.userretId = userretId;
	}



	@Override
	public List<ReturnedBooksPojo> getAllReturnBooks(int userretId) throws EmptyCatelogException, SystemException {
		
		return retBooksDao.getAllReturnBooks(userretId);
	}



	@Override
	public void returnBooks(int returnBookId) throws SystemException {
		retBooksDao.returnBook(returnBookId);
		
	}



	@Override
	public ReturnedBooksPojo getAbook(int returnBookId) throws SystemException {
		return retBooksDao.getAbook(returnBookId);
	}



	


	
	
}