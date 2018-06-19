package com.multiply;

public class MultiplyOperations {

	public void printMultiply(int number) {
		
		int multiply=0;
		for(int i=1 ; i<=10 ; i++)
		{
			multiply=number*i;
			System.out.println(number+" x "+i+" = "+multiply);
		}
		
	}
	
}
