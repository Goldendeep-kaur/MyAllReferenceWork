package Pojo;

public class AdminPojo {

	private int bookId;
	private int bookIsbn;

	private String bookName;
	private String bookPublisher;
	private int bookQuantity;
	private String bookImgUrl;

	public AdminPojo() {

	}

	public AdminPojo(int bookId, int bookIsbn, String bookName, String bookPublisher, int bookQuantity,
			String bookImgUrl) {
		super();
		this.bookId = bookId;
		this.bookIsbn = bookIsbn;

		this.bookName = bookName;
		this.bookPublisher = bookPublisher;
		this.bookQuantity = bookQuantity;
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
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + bookId;
		result = prime * result + ((bookImgUrl == null) ? 0 : bookImgUrl.hashCode());
		result = prime * result + bookIsbn;
		result = prime * result + ((bookName == null) ? 0 : bookName.hashCode());
		result = prime * result + ((bookPublisher == null) ? 0 : bookPublisher.hashCode());
		result = prime * result + bookQuantity;
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
		AdminPojo other = (AdminPojo) obj;
		if (bookId != other.bookId)
			return false;
		if (bookImgUrl == null) {
			if (other.bookImgUrl != null)
				return false;
		} else if (!bookImgUrl.equals(other.bookImgUrl))
			return false;
		if (bookIsbn != other.bookIsbn)
			return false;
		if (bookName == null) {
			if (other.bookName != null)
				return false;
		} else if (!bookName.equals(other.bookName))
			return false;
		if (bookPublisher == null) {
			if (other.bookPublisher != null)
				return false;
		} else if (!bookPublisher.equals(other.bookPublisher))
			return false;
		if (bookQuantity != other.bookQuantity)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "AdminPojo [bookId=" + bookId + ", bookIsbn=" + bookIsbn + ", bookName=" + bookName + ", bookPublisher="
				+ bookPublisher + ", bookQuantity=" + bookQuantity + ", bookImgUrl=" + bookImgUrl + "]";
	}

}
