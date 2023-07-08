package Junit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class AnnotationsExample {
	@BeforeClass
	public static void beforeClass(){
		System.out.println("Before class : will Execute before all methods");
		
	}
	@AfterClass
	public static void afterClass(){
		System.out.println("After class : will Execute after all methods");
	}
	@Before
	public  void before(){
		System.out.println("before: will Execute after all methods");
	}
	@After
	public  void after(){
		System.out.println("after: will Execute after all methods");
	}
	@Test
	public void test() {
		System.out.println("Inside test");
	}
	@Ignore
	public void ingore() {
		System.out.println("inside ingore");
	}
	
	

}
