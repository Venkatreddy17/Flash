package Junit;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AssertionExample {

	@Test
	public void testAssertio (){
		String str1=new String("Himmu");
		String str2=new String("Himmu");
		String str3="Welcome";
		String str4="Welcome";
		String str5=null;
		
		int a=10;
		int b=10;
		
		assertEquals(str1, str2);
		assertTrue(a==b);
		assertFalse(a>b);
		assertSame(str3, str4);
		assertNull(str5);
		assertNotNull(str4);
		
		
		String s1[]= {"one","two","three"};
		String s2[]= {"one","two","three"};
		
		assertArrayEquals(s1,s2);
		
		
	}

}
