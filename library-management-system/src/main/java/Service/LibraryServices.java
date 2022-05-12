package Service;

import java.util.List;

import model.LibraryPojo;

public interface LibraryServices {
	LibraryPojo addBooks(LibraryPojo libraryPojo);
	LibraryPojo updateBooks(LibraryPojo libraryPojo);
	void deleteBook(int book_id);
	List<LibraryPojo>getAllBooks();
	LibraryPojo getABook(int book_Id);

}
