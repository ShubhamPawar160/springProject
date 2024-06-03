package com.pawarit.calculator;

public class EvenOrOdd {

	public boolean chkEvenOdd(int num)
	{
//		int num=7;
		if(num % 2==0)
		{
			System.out.println(num +" is Even Number");
			return true;
		}else
		{
			System.out.println(num+" is odd number");
			return false;
		}
		
		
	}
	
	
}
