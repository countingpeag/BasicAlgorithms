package com.pascal;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PascalOperations pascal = new PascalOperations();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter any number:");
		int number = scanner.nextInt();
		
		pascal.printPascal(number);
	}

}
