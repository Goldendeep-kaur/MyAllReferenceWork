package service;

import java.util.List;

import exception.EmptyCatelogException;
import exception.SystemException;
import Pojo.IssuBooksPojo;

public interface IssueBookService {
	
	List<IssuBooksPojo>getallIssueBooks(int userissuid) throws EmptyCatelogException, SystemException;
	IssuBooksPojo borrowBooks(IssuBooksPojo issueBooksPojo)throws SystemException;

}
