package Junit;

public class UserLogin {
	String userName;
	String passWord;
	public String getUsername() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName=userName;
	}
	public String getPassword() {
		return passWord;
	}
	public void setPssWord(String passWord) {
		this.passWord=passWord;
	}
	boolean checkCredentials() {
		if(userName=="admin"&& passWord=="admin123")
		return true;
		else
			return false;
	}

}
