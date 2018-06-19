package com.factorial;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		FactorialOperations factorial = new FactorialOperations();
		int number=0;
		
		System.out.println("Enter any number");
		number = scanner.nextInt();
		int factorialResult=0;
		
		for(int i=1 ; i<=number ; i++)
		{
			factorialResult = factorial.getFactorial(i);
			System.out.println("The factorial of "+i+" is: "+factorialResult);
		}
		
		
	}

}
