package edu_works.junit;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class StringManipulationTest {
	static StringManipulation s = null;
	
	@BeforeClass
	public static void beforeClass() {
		System.out.println("Greetings....");
		s = new StringManipulation();
	}
	
	@AfterClass
	public static void afterClass() {
		System.out.println("Thank you....");
		s = null;
	}
	
	
	@Before
	public void createObj() {
		System.out.println("Before Test");
		//s = new StringManipulation();
	}
	
	@After
	public void destroyObj() {
		System.out.println("After Test");
		//s = null;
	}
	
	@Test
	public void testReverseWord() {
		System.out.println(s.hashCode());
		 assertEquals("olleh",s.reverseWord("hello"));
	}

	
	  @Test 
	  public void testReverseCase() {
		  System.out.println(s.hashCode());
	  assertEquals("HELLO",s.reverseCase("hello")); }
	 

}
