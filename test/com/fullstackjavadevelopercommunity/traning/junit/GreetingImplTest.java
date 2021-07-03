package com.fullstackjavadevelopercommunity.traning.junit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author Full Stack Java developer Community
 *
 *         Jul 3, 2020
 */
public class GreetingImplTest {

	private GreetingImpl greetingImpl;

	@Before
	public void setUp() {
		System.out.println("setUp");
		greetingImpl = new GreetingImpl();
		
	}
	/**
	 * Test method for
	 * {@link GreetingImpl#greet(java.lang.String)}.
	 */
	@Test
	public void greetShouldValidOutput() {
		System.out.println("greetShouldValidOutput");
		// fail("Not yet implemented");
		String greet = greetingImpl.greet("Junit");
		assertNotNull(greet);
		assertEquals("Hello Junit", greet);
	}

	@Test(expected = IllegalArgumentException.class)
	public void greetShouldThrowAnException_for_nameIsNull() {
		System.out.println("greetShouldThrowAnException_for_nameIsNull");
		greetingImpl.greet(null);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void greetShouldThrowAnException_for_nameIsBlank() {
		System.out.println("greetShouldThrowAnException_for_nameIsBlank");
		greetingImpl.greet("");
	}
	
	@After
	public void tearDown() {
		System.out.println("tearDown");
		greetingImpl=null;
	}

}
