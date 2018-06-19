package com.factorial;

public class FactorialOperations {

	public int getFactorial(int number)
	{
		int container=1;
		
		for(int i=1 ; i<=number ; i++)
			container*=i;
		
		return container;
	}
}
