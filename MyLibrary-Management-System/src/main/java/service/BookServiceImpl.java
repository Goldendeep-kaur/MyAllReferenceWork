package service;

import java.util.List;

import dao.BooksDao;
import dao.BooksDaoImpl;
import exception.EmptyCatelogException;
import exception.SystemException;
import Pojo.BooksPojo;

public class BookServiceImpl implements BookService {

	BooksDao booksDao;

	public BookServiceImpl() {
		booksDao = new BooksDaoImpl();
	}

	public BooksDao getBooksDao() {
		return booksDao;
	}

	public void setBooksDao() {
		this.booksDao = booksDao;
	}

	@Override
	public BooksPojo addBook(BooksPojo booksPojo) throws SystemException {
		return booksDao.addBook(booksPojo);
	}

	@Override
	public BooksPojo updateBook(BooksPojo booksPojo) throws SystemException {
		return booksDao.updateBook(booksPojo);
	}

	@Override
	public void deleteBook(int bookId) throws SystemException {
		// TODO Auto-generated method stub
		booksDao.deleteBook(bookId);

	}

	@Override
	public List<BooksPojo> getAllBooks() throws EmptyCatelogException, SystemException {
		return booksDao.getAllBooks();
	}

	@Override
	public BooksPojo getABook(int bookId) throws SystemException {
		return booksDao.getABook(bookId);
	}

}
