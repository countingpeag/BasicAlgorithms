package com.multiply;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		MultiplyOperations multiply = new MultiplyOperations();
		
		System.out.println("Enter any number:");
		int number = scanner.nextInt();
		
		multiply.printMultiply(number);

	}

}
