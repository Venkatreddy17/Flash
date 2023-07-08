package Junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class UserLoginTest {

	@Test
	public void positiveLongintest() {
		UserLogin user=new UserLogin();
		user.setUserName("admin");
		user.setPssWord("admin123");
		
		assertTrue(user.checkCredentials());
		
	}
	@Test
	public void negativeLogintest() {
		UserLogin user=new UserLogin();
		user.setUserName("adimin");
		user.setPssWord("admin");
		
		assertFalse(user.checkCredentials());
	}

}
