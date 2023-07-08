package Junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class AgeTest {

	@Test
	public void testCorrectAge() { //+ve test
		Age age=new Age();
		age.setAge(22);
		
		assertTrue(age.ageCalculator());
		
	}
	@Test
	public void testWrongAge() {
		Age age=new Age();
		age.setAge(17);
		
		assertFalse(age.ageCalculator());
	}

}
