package service;

import java.util.List;

import exception.EmptyCatelogException;
import exception.SystemException;
import Pojo.AdminPojo;
import Pojo.AdminViewPojo;
import Pojo.UserPojoo;

public interface AdminViewService {

	List<AdminViewPojo> getAllUsers() throws SystemException;

	AdminPojo addBook(AdminPojo adminPojo) throws SystemException;

	AdminPojo updateBook(AdminPojo adminPojo) throws SystemException;

	void deleteBook(int bookId) throws SystemException;

	List<AdminPojo> getAllBooks() throws EmptyCatelogException, SystemException;

	AdminPojo getABook(int bookId) throws SystemException;

}
