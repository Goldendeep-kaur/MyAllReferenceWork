package Dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import model.LibraryPojo;

public class LibraryCollectionDaoImpl implements LibraryDao {

	List<LibraryPojo> allBooks= new ArrayList<LibraryPojo>();
	
	

	public LibraryCollectionDaoImpl() {
		LibraryPojo book1= new LibraryPojo(1, 101, "Java","RealJava", "");
		LibraryPojo book2= new LibraryPojo(2,103,"C++","Klyani","");
		LibraryPojo book3= new LibraryPojo(3,106,"C","Bansal","");
		allBooks.add(book1);
		allBooks.add(book2);
		allBooks.add(book3);
	
	}

	public LibraryPojo addBooks() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public LibraryPojo addBooks(LibraryPojo libraryPojo) {
		int newBookId= allBooks.get(allBooks.size()-1).getBookId()+1;
		libraryPojo.setBookId(newBookId);
		allBooks.add(libraryPojo);
		return libraryPojo;
	}

	@Override
	public LibraryPojo updateBook(LibraryPojo libraryPojo) {
		// TODO Auto-generated method stub
		for(int i=0; i<allBooks.size();i++) {
			if(allBooks.get(i).getBookId()==libraryPojo.getBookId()) {
				allBooks.set(i, libraryPojo);
			}
		}
		return libraryPojo;
	}

	@Override
	public void deleteBook(int bookId) {
		// TODO Auto-generated method stub
		Iterator<LibraryPojo> allBooksItr= allBooks.iterator();
		while(allBooksItr.hasNext()) {
			LibraryPojo getBook= allBooksItr.next();
			if(getBook.getBookId()==bookId) {
				allBooks.remove(bookId);
				break;
			}
		}
		
	}

	@Override
	public List<LibraryPojo> getAllBooks() {
		// TODO Auto-generated method stub
		
		return allBooks;
	}

	@Override
	public LibraryPojo getABook(int bookId) {
		// TODO Auto-generated method stub
		
		LibraryPojo foundBook=null;
		for(int i=0;i<allBooks.size();i++) {
			if(allBooks.get(i).getBookId()==bookId) {
				foundBook=allBooks.get(i);
				break;
			}
		}
		return foundBook;
	}



}
