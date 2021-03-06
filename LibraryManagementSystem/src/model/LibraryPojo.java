package model;

public class LibraryPojo {

	private int bookId;
	private int bookIsbn;
	private String bookName;
	private String bookPublisher;
	private String bookUrlImage;
	
	public LibraryPojo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public LibraryPojo(int bookId, int bookIsbn, String bookName, String bookPublisher, String bookUrlImage) {
		super();
		this.bookId = bookId;
		this.bookIsbn = bookIsbn;
		this.bookName = bookName;
		this.bookPublisher = bookPublisher;
		this.bookUrlImage = bookUrlImage;
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public int getBookIsbn() {
		return bookIsbn;
	}

	public void setBookIsbn(int bookIsbn) {
		this.bookIsbn = bookIsbn;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getBookPublisher() {
		return bookPublisher;
	}

	public void setBookPublisher(String bookPublisher) {
		this.bookPublisher = bookPublisher;
	}

	public String getBookUrlImage() {
		return bookUrlImage;
	}

	public void setBookUrlImage(String bookUrlImage) {
		this.bookUrlImage = bookUrlImage;
	}

	@Override
	public String toString() {
		return "LibraryPojo [bookId=" + bookId + ", bookIsbn=" + bookIsbn + ", bookName=" + bookName
				+ ", bookPublisher=" + bookPublisher + ", bookUrlImage=" + bookUrlImage + "]";
	}
	
	
	
	
}
