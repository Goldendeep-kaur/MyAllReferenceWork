package pojo;

public class UserPojo {

	 int userId;
	 String userFName;
	 String userLName;
	 String userName;
	 String userPassword;
	 String userType;
	public UserPojo() {
		
	}
	public UserPojo(int userId, String userFName, String userLName, String userName, String userPassword,
			String userType) {
		super();
		this.userId = userId;
		this.userFName = userFName;
		this.userLName = userLName;
		this.userName = userName;
		this.userPassword = userPassword;
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
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}
	@Override
	public String toString() {
		return "UserPojo [userId=" + userId + ", userFName=" + userFName + ", userLName=" + userLName + ", userName="
				+ userName + ", userPassword=" + userPassword + ", userType=" + userType + "]";
	}
	
}
