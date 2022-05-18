package model;

import java.sql.Date;
import java.time.LocalDate;

public class IssuBooksPojo {
	
	private int issuedId;
	private int bookId;
	private int userId;
	private int timePeriod;
	private String issuedDate;
	private int booksTotal;
	
	public IssuBooksPojo() {
		
		
	}
	
	

	public IssuBooksPojo(int issuedId, int bookId, int userId, int timePeriod, String issuedDate, int booksTotal) {
		super();
		this.issuedId = issuedId;
		this.bookId = bookId;
		this.userId = userId;
		this.timePeriod = timePeriod;
		this.issuedDate = issuedDate;
		this.booksTotal = booksTotal;
	}



	public int getIssuedId() {
		return issuedId;
	}

	public void setIssuedId(int issuedId) {
		this.issuedId = issuedId;
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getTimePeriod() {
		return timePeriod;
	}

	public void setTimePeriod(int timePeriod) {
		this.timePeriod = timePeriod;
	}

	public String getIssuedDate() {
		return issuedDate;
	}

	public void setIssuedDate(String issuedDate) {
		this.issuedDate = issuedDate;
	}

	public int getBooksTotal() {
		return booksTotal;
	}

	public void setBooksTotal(int books_total) {
		this.booksTotal = books_total;
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + bookId;
		result = prime * result + booksTotal;
		result = prime * result + ((issuedDate == null) ? 0 : issuedDate.hashCode());
		result = prime * result + issuedId;
		result = prime * result + timePeriod;
		result = prime * result + userId;
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
		IssuBooksPojo other = (IssuBooksPojo) obj;
		if (bookId != other.bookId)
			return false;
		if (booksTotal != other.booksTotal)
			return false;
		if (issuedDate == null) {
			if (other.issuedDate != null)
				return false;
		} else if (!issuedDate.equals(other.issuedDate))
			return false;
		if (issuedId != other.issuedId)
			return false;
		if (timePeriod != other.timePeriod)
			return false;
		if (userId != other.userId)
			return false;
		return true;
	}



	@Override
	public String toString() {
		return "IssuBooksPojo [issuedId=" + issuedId + ", bookId=" + bookId + ", userId=" + userId + ", timePeriod="
				+ timePeriod + ", issuedDate=" + issuedDate + ", booksTotal=" + booksTotal + "]";
	}

	
	
}
