package service;

import java.util.List;

import exception.EmptyCatelogException;
import exception.SystemException;
import model.AdminPojo;
import model.AdminViewPojo;

public interface AdminService {

	AdminPojo addBook(AdminPojo adminPojo) throws SystemException;

	AdminPojo updateBook(AdminPojo adminPojo) throws SystemException;

	void deleteBook(int bookId) throws SystemException;

	List<AdminPojo> getAllBooks() throws EmptyCatelogException, SystemException;

	AdminPojo getABook(int bookId) throws SystemException;
	
	//AdminViewPojo validateLogin(AdminViewPojo admPojo)throws SystemException;
	
}
