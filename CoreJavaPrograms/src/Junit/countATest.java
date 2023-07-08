package Junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class countATest {

	@Test
	public void test() {
		CountingChar contchar=new CountingChar();
		int count=contchar.countA("priyanka");
		
		
		assertEquals(2, count);
		
	}

}
