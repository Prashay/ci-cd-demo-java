package com.junit.demo;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


/*@FixMethodOrder(MethodSorters.NAME_ASCENDING)*/
public class CalculatorTest {
   private Calculator calc;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("BeforeClass");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("AfterClass");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("before");
		calc = new Calculator();
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("after");
		calc=null;
	}

	@Test
	public void testAddValid() {
		int result= calc.calculatesum(10,20);
		assertEquals("Both are equals",30, result);
	}
	@Test
	public void testAddinvalidoper1() {
		int result= calc.calculatesum(-10,20);
		assertEquals(-1, result);
	}
	@Test
	public void testAddinvalidoper2() {
		int result= calc.calculatesum(10,-20);
		assertEquals(-1, result);
	}
	@Test
	public void testAddinvalidoperboth() {
		int result= calc.calculatesum(-10,-20);
		assertEquals(-1, result);
	}
	@Test
	public void testDividevalid() {
		int result= calc.divide(10, 2);
		assertEquals(5, result);
	}
	@Test
	public void testDivideinvalid() {
		try {
		int result= calc.divide(10, 0);
		fail();
		}
		catch(ArithmeticException e) {
			assertTrue(true);
		}
	}
}
