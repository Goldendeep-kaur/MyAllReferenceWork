package model;

public class AdminViewPojo {
	private int userId;
	private String userFName;
	private String userLName;
	private String userName;
	private String password;
	private String userType;
	public AdminViewPojo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AdminViewPojo(int userId, String userFName, String userLName, String userName, String password,
			String userType) {
		super();
		this.userId = userId;
		this.userFName = userFName;
		this.userLName = userLName;
		this.userName = userName;
		this.password = password;
		this.userType = userType;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserFName() {
		return userFName;
	}
	public void setUserFName(String userFName) {
		this.userFName = userFName;
	}
	public String getUserLName() {
		return userLName;
	}
	public void setUserLName(String userLName) {
		this.userLName = userLName;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((userFName == null) ? 0 : userFName.hashCode());
		result = prime * result + userId;
		result = prime * result + ((userLName == null) ? 0 : userLName.hashCode());
		result = prime * result + ((userName == null) ? 0 : userName.hashCode());
		result = prime * result + ((userType == null) ? 0 : userType.hashCode());
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
		AdminViewPojo other = (AdminViewPojo) obj;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (userFName == null) {
			if (other.userFName != null)
				return false;
		} else if (!userFName.equals(other.userFName))
			return false;
		if (userId != other.userId)
			return false;
		if (userLName == null) {
			if (other.userLName != null)
				return false;
		} else if (!userLName.equals(other.userLName))
			return false;
		if (userName == null) {
			if (other.userName != null)
				return false;
		} else if (!userName.equals(other.userName))
			return false;
		if (userType == null) {
			if (other.userType != null)
				return false;
		} else if (!userType.equals(other.userType))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "AdminViewPojo [userId=" + userId + ", userFName=" + userFName + ", userLName=" + userLName
				+ ", userName=" + userName + ", password=" + password + ", userType=" + userType + "]";
	}
	
	
	
	
}
