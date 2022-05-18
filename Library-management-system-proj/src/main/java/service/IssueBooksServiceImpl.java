package service;

import java.util.List;

import dao.IssueBooksDaoImpl;
import dao.IssuedBooksDao;
import exception.EmptyCatelogException;
import exception.SystemException;
import Pojo.IssuBooksPojo;

public class IssueBooksServiceImpl implements IssueBookService{
	IssuedBooksDao issuBookDao;
	private int userissuid;
	
	
	public IssueBooksServiceImpl() {
		issuBookDao= new IssueBooksDaoImpl();
	}
	
	

	public IssuedBooksDao getIssuBookDao() {
		return issuBookDao;
	}



	public void setIssuBookDao(IssuedBooksDao issuBookDao) {
		this.issuBookDao = issuBookDao;
	}



	@Override
	public List<IssuBooksPojo> getallIssueBooks(int userissuid) throws EmptyCatelogException, SystemException {
		
		
		// TODO Auto-generated method stub
		return issuBookDao.getallIssueBooks(userissuid);
	}

	@Override
	public IssuBooksPojo borrowBooks(IssuBooksPojo issueBooksPojo) throws SystemException {
		// TODO Auto-generated method stub
		return issuBookDao.borrowBooks(issueBooksPojo);
	}

}
