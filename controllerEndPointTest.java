package com.example.demo;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

class controllerEndPointTest {
	
	private String sut;
	
	@BeforeClass
	public static void setupAll()
	{
		System.out.println("Running Endpoint tests...");
	}

	@Before
	public void setUp()
	{
		sut = "http://localhost:8080";
	}
	
	@Test
	public void testPlusEndpoint() 
	{
		
		// http://localhost:8080/sum?number1=10&number2=5&operation=PLUS
		
		String inputNumber1 = "10";
		String inputNumber2 = "5";
		
		String url = sut + "/sum?number1="
							+ inputNumber1 +
							"&number2=" 
							+ inputNumber2 +
							"&operation=PLUS";
		
		// HttpHelper cant be resolved?
		// String actual = HttpHelper.UrlResponse();
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
