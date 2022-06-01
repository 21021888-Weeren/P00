import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAdd() {
		//arrange
		int a = 4321;
		int b = 1234;
		Calculator cal = new Calculator();
		
		//Act 
		int actual = cal.add(a, b);
		
		//Assert 
		int expected = 5555;
		assertEquals(expected, actual);
	}
	@Test
	public void testSubtract() {
		//arrange 
		int a = 5;
		int b = 4;
		Calculator cal = new Calculator();
		
		//Act 
		int actual = cal.subtract(a, b);
		
		//Assert 
		int expected = 1;
		assertEquals(expected, actual);
	}
	@Test
	public void testMultiply() {
		//arrange 
		int a = 5;
		int b = 4;
		Calculator cal = new Calculator();
		
		//Act 
		int actual = cal.multiply(a, b);
		
		//Assert 
		int expected = 20;
		assertEquals(expected, actual);
	}
	@Test
	public void testDivide() {
		//arrange 
		int a = 8;
		int b = 4;
		Calculator cal = new Calculator();
		
		//Act 
		int actual = cal.divide(a, b);
		
		//Assert 
		int expected = 2;
		assertEquals(expected, actual);
	}
}