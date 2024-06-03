package com.pawarit.calculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EvenOrOddTest {
	
	EvenOrOdd eo=new EvenOrOdd();
	
	@Test
   public void evenoddTest()
   {
	   boolean actual = eo.chkEvenOdd(3);
	   boolean expect=true;
	   
	   assertEquals(expect, actual);
   }

}
