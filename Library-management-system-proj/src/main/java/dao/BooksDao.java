package dao;

import java.util.List;

import exception.EmptyCatelogException;
import exception.SystemException;
import Pojo.BooksPojo;


public interface BooksDao {

	
	BooksPojo addBook(BooksPojo booksPojo) throws SystemException;

	BooksPojo updateBook(BooksPojo adminPojo) throws SystemException;

	void deleteBook(int bookId) throws SystemException;

	List<BooksPojo> getAllBooks() throws EmptyCatelogException, SystemException;

	BooksPojo getABook(int bookId) throws SystemException;
}
