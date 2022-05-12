package Dao;

import java.util.List;

import model.LibraryPojo;

public interface LibraryDao {

	LibraryPojo addBooks(LibraryPojo libraryPojo);
	LibraryPojo updateBook(LibraryPojo libraryPojo);
	void deleteBook(int bookId);
	List<LibraryPojo>getAllBooks();
	LibraryPojo getABook(int bookId);
}

