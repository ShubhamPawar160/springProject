package com.pawarit.calculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorsTest {

	Calculators cal = new Calculators();

	@Test
	public void sumTest() {

		int expectedResult = cal.sum(2, 2);
		int actualResult = 4;
		assertEquals(expectedResult, actualResult);
	}

	@Test
	public void subTest() {

		int actual = cal.sub(3, 2);
		int expect=1;
		assertEquals(expect, actual);
		
	}
	
	@Test
	public void divTest()
	{
		int actual = cal.division(10, 5);
		int expect = 2;
		assertEquals(expect, actual);
	}
	
	// or we can simply declare this
	
	@Test
	public void multTest()
	{
		assertEquals(4, cal.mult(2, 2));
	}

}
