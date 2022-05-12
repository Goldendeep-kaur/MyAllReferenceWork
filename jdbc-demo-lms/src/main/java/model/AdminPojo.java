package model;

public class AdminPojo {

	private int bookId;
	private int bookIsbn;
	
	private String bookName;
	private String bookPublisher;
	private int bookQuantity;
	private String bookImgUrl;
	
	public AdminPojo() {
		
	}
	public AdminPojo(int bookId, int bookIsbn, String bookName, String bookPublisher,int bookQuantity,String bookImgUrl) {
		super();
		this.bookId = bookId;
		this.bookIsbn = bookIsbn;
		
		this.bookName = bookName;
		this.bookPublisher = bookPublisher;
		this.bookQuantity=bookQuantity;
		this.bookImgUrl = bookImgUrl;
		
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
	public int getBookQuantity() {
		return bookQuantity;
	}
	public void setBookQuantity(int bookQuantity) {
		this.bookQuantity = bookQuantity;
	}
	public String getBookImgUrl() {
		return bookImgUrl;
	}
	public void setBookImgUrl(String bookImgUrl) {
		this.bookImgUrl = bookImgUrl;
	}
	@Override
	public String toString() {
		return "AdminPojo [bookId=" + bookId + ", bookIsbn=" + bookIsbn + ", bookName=" + bookName + ", bookPublisher="
				+ bookPublisher + ", bookQuantity=" + bookQuantity + ", bookImgUrl=" + bookImgUrl + "]";
	}
	
	
	
	
	
	
}
