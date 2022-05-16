package model;

public class LoginPojo {
	private String uName;
	private String uPassword;
	private int uType;
	public LoginPojo() {
		
	}
	public LoginPojo(String uName, String uPassword, int uType) {
		super();
		this.uName = uName;
		this.uPassword = uPassword;
		this.uType = uType;
	}
	public String getuName() {
		return uName;
	}
	public void setuName(String uName) {
		this.uName = uName;
	}
	public String getuPassword() {
		return uPassword;
	}
	public void setuPassword(String uPassword) {
		this.uPassword = uPassword;
	}
	public int getuType() {
		return uType;
	}
	public void setuType(int uType) {
		this.uType = uType;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((uName == null) ? 0 : uName.hashCode());
		result = prime * result + ((uPassword == null) ? 0 : uPassword.hashCode());
		result = prime * result + uType;
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
		LoginPojo other = (LoginPojo) obj;
		if (uName == null) {
			if (other.uName != null)
				return false;
		} else if (!uName.equals(other.uName))
			return false;
		if (uPassword == null) {
			if (other.uPassword != null)
				return false;
		} else if (!uPassword.equals(other.uPassword))
			return false;
		if (uType != other.uType)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "LoginPojo [uName=" + uName + ", uPassword=" + uPassword + ", uType=" + uType + "]";
	}
	
	
	
}
