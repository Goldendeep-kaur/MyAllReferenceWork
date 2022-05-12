package Service;

import java.util.List;

import Dao.LibraryDao;
import Dao.LibraryDaoDatabaseImpl;
import model.LibraryPojo;

public class LibraryServiceDbImpl implements LibraryServices {

	LibraryDao libraryDao;
	
	public LibraryServiceDbImpl() {
		libraryDao= new LibraryDaoDatabaseImpl();
	}

	@Override
	public LibraryPojo addBooks(LibraryPojo libraryPojo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public LibraryPojo updateBooks(LibraryPojo libraryPojo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteBook(int book_id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<LibraryPojo> getAllBooks() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public LibraryPojo getABook(int book_Id) {
		// TODO Auto-generated method stub
		return null;
	}

}
