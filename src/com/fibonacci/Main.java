package com.fibonacci;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any number:");
		int number = scanner.nextInt();
		
		FibonacciOperations fibonacci = new FibonacciOperations();
		fibonacci.printFibonacci(number);
	}

}
