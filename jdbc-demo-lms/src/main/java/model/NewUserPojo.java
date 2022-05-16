package model;

public class NewUserPojo {

	private int userId;
	private String userFName;
	private String userLName;
	private String userName;
	private String password;
	private int userType;
	public NewUserPojo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public NewUserPojo(int userId, String userFName, String userLName, String userName, String password, int userType) {
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
	public int getUserType() {
		return userType;
	}
	public void setUserType(int userType) {
		this.userType = userType;
	}
	@Override
	public String toString() {
		return "NewUserPojo [userId=" + userId + ", userFName=" + userFName + ", userLName=" + userLName + ", userName="
				+ userName + ", password=" + password + ", userType=" + userType + "]";
	}
	
	
}

