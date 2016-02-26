package base;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyInteger_Test {
	
	MyInteger myint = new MyInteger(2);
	MyInteger myint1 = new MyInteger(9);
	MyInteger myint2 = new MyInteger(13);
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void Integertest() {
		assertEquals(myint.isEven(), true);
		assertEquals(myint.isOdd(), false);
		assertEquals(myint.isPrime(), true);
		assertEquals(myint1.isEven(), false);
		assertEquals(myint1.isOdd(), true);
		assertEquals(myint1.isPrime(), false);
		assertEquals(myint2.isEven(), false);
		assertEquals(myint2.isOdd(), true);
		assertEquals(myint2.isPrime(), true);
		
		
	}

}
