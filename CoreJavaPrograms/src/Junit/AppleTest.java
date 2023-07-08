package Junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class AppleTest {

	@Test //+ve test
	public void testCorrectColour() {
		Apple apple=new Apple();
		apple.setColour("green");
		
		assertTrue(apple.checkColour());//return true if checkColour() return true
	
	}
	@Test //-ve test // return true if checkColour() returns false 
	public void testWrongColour() {
		Apple apple=new Apple();
		apple.setColour("blue");
		
		assertFalse(apple.checkColour());
		
	}
	

}
