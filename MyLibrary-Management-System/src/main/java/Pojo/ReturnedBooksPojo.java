package Pojo;

public class ReturnedBooksPojo {

	private int returnBookId;
	private int bookId1;
	private int userId1;
	private String returnDate;
	private int booksTotal;
	public ReturnedBooksPojo() {
		
	}
	public ReturnedBooksPojo(int returnBookId, int bookId1, int userId1, String returnDate, int booksTotal) {
		super();
		this.returnBookId = returnBookId;
		this.bookId1 = bookId1;
		this.userId1 = userId1;
		this.returnDate = returnDate;
		this.booksTotal = booksTotal;
	}
	public int getReturnBookId() {
		return returnBookId;
	}
	public void setReturnBookId(int returnBookId) {
		this.returnBookId = returnBookId;
	}
	public int getBookId1() {
		return bookId1;
	}
	public void setBookId1(int bookId1) {
		this.bookId1 = bookId1;
	}
	public int getUserId1() {
		return userId1;
	}
	public void setUserId1(int userId1) {
		this.userId1 = userId1;
	}
	public String getReturnDate() {
		return returnDate;
	}
	public void setReturnDate(String returnDate) {
		this.returnDate = returnDate;
	}
	public int getBooksTotal() {
		return booksTotal;
	}
	public void setBooksTotal(int booksTotal) {
		this.booksTotal = booksTotal;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + bookId1;
		result = prime * result + booksTotal;
		result = prime * result + returnBookId;
		result = prime * result + ((returnDate == null) ? 0 : returnDate.hashCode());
		result = prime * result + userId1;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ReturnedBooksPojo other = (ReturnedBooksPojo) obj;
		if (bookId1 != other.bookId1)
			return false;
		if (booksTotal != other.booksTotal)
			return false;
		if (returnBookId != other.returnBookId)
			return false;
		if (returnDate == null) {
			if (other.returnDate != null)
				return false;
		} else if (!returnDate.equals(other.returnDate))
			return false;
		if (userId1 != other.userId1)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "ReturnedBooksPojo [returnBookId=" + returnBookId + ", bookId1=" + bookId1 + ", userId1=" + userId1
				+ ", returnDate=" + returnDate + ", booksTotal=" + booksTotal + "]";
	}
	
	
}
