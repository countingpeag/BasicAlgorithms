package com.fibonacci;

public class FibonacciOperations {

	public void printFibonacci(int number) 
	{
		int oldNumber = 0;
		int newNumber = 1;
		int acomulator = 0;
		
		System.out.print("Fibonacci: ");
		for(int i=0 ; i<number ; i++)
		{
			System.out.print(newNumber+", ");
			
			acomulator = newNumber;
			newNumber = oldNumber+newNumber;
			oldNumber = acomulator;
		}
	}
}
