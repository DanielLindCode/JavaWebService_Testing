package com.example.demo;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class controllerTest {

	private controller sut;

	@BeforeClass
	public static void setupAll()
	{
		System.out.println("Running application tests...");
	}

	@Before
	public void setUp()
	{
		sut = new controller();
	}
	
	// Tests for the operator "PLUS"
	@Test
	public void testOperatorPlusSucsess() 
	{
		String actual = sut.calculation("1", "1", "PLUS");
		String expected = "Result: 2";
		assertEquals(actual, expected);
	}
	@Test
	public void testOperatorPlusFail() 
	{
		String actual = sut.calculation("2", "5", "PLUS");
		String expected = "Result: 90";
		assertNotEquals(actual, expected);
	}
	@Test
	public void testUnexpectedOperatorPlus()
	{
		String actual = sut.calculation("1", "1", "+");
		String expected = "Invalid operator!";
		assertEquals(actual, expected);
	}
	@Test(expected = NumberFormatException.class)
	public void testUnexpectedInputPlus() 
	{
		String actual = sut.calculation("two", "5", "PLUS");
	}

	// Tests for the operator "MINUS"
	@Test
	public void testOperatorMinusSucsess()
	{

		String actual = sut.calculation("2", "1", "MINUS");
		String expected = "Result: 1";
		assertEquals(actual, expected);
	}
	@Test
	public void testOperatorMinusFail()
	{

		String actual = sut.calculation("5", "1", "MINUS");
		String expected = "Result: 404";
		assertNotEquals(actual, expected);
	}
	@Test
	public void testUnexpectedOperatorMinus()
	{

		String actual = sut.calculation("2", "1", "-");
		String expected = "Invalid operator!";
		assertEquals(actual, expected);
	}
	@Test(expected = NumberFormatException.class)
	public void testUnexpectedInputMinus() 
	{
		String actual = sut.calculation("two", "5", "MINUS");
	}

	// Tests for the operator "TIMES"
	@Test
	public void testOperatorTimesSucsess()
	{

		String actual = sut.calculation("2", "2", "TIMES");
		String expected = "Result: 4";
		assertEquals(actual, expected);
	}
	@Test
	public void testOperatorTimesFail()
	{

		String actual = sut.calculation("2", "2", "TIMES");
		String expected = "Result: 403";
		assertNotEquals(actual, expected);
	}
	@Test
	public void testUnexpectedOperatorTimes()
	{

		String actual = sut.calculation("2", "2", "*");
		String expected = "Invalid operator!";
		assertEquals(actual, expected);
	}
	@Test(expected = NumberFormatException.class)
	public void testUnexpectedInputTimes() 
	{
		String actual = sut.calculation("two", "5", "TIMES");
	}

	// Tests for the operator "DIVIDE"
	@Test
	public void testOperatorDivideSucsess() 
	{

		String actual = sut.calculation("4", "2", "DIVIDE");
		String expected = "Result: 2";
		assertEquals(actual, expected);
	}
	@Test
	public void testOperatorDivideFail() 
	{

		String actual = sut.calculation("404", "2", "DIVIDE");
		String expected = "Result: 1337";
		assertNotEquals(actual, expected);
	}
	@Test
	public void testDivideByZero()
	{
		String actual = sut.calculation("15", "0", "DIVIDE");
		String expected = "Result: 0";
		assertEquals(actual, expected);		
	}
	@Test
	public void testUnexpectedOperatorDivide() 
	{

		String actual = sut.calculation("4", "2", "/");
		String expected = "Invalid operator!";
		assertEquals(actual, expected);
	}
	@Test(expected = NumberFormatException.class)
	public void testUnexpectedInputDivide() 
	{
		String actual = sut.calculation("two", "5", "DIVIDE");
	}
	
	// The calculator method for a string of numbers is not functional
	// This makes it hard to test but these are the testing methods I
	// would be using. (Expected 9 Failures)
	
	// Testing multi-number calculator with operator "PLUS"
	@Test
	public void testMultiCalcPlusSucsess()
	{
		fail("Method not functional"); // TODO
	}
	@Test
	public void testMultiCalcPlusFail() 
	{
		fail("Method not functional"); // TODO
	}
	@Test
	public void testUnexpectedInputMultiCalcPlus() 
	{
		fail("Method not functional"); // TODO
	}
	
	// Testing multi-number calculator with operator "MINUS"
	@Test
	public void testMultiCalcMinusSucsess()
	{
		fail("Method not functional"); // TODO
	}
	@Test
	public void testMultiCalcMinusFail() 
	{
		fail("Method not functional"); // TODO
	}
	@Test
	public void testUnexpectedInputMultiCalcMinus() 
	{
		fail("Method not functional"); // TODO
	}
	
	// Testing multi-number calculator with operator "TIMES"
	@Test
	public void testMultiCalcTimesSucsess()
	{
		fail("Method not functional"); // TODO
	}
	@Test
	public void testMultiCalcTimesFail() 
	{
		fail("Method not functional"); // TODO
	}
	@Test
	public void testUnexpectedInputTimesCalcMinus() 
	{
		fail("Method not functional"); // TODO
	}

	@After
	public void tearDown() {
		// code executed after each test method
	}

	@AfterClass
	public static void tearDownClass()
	{
		System.out.println("All tests done!");
	}
}