package com.numeroprimo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		EsPrimoOperations esPrimo = new EsPrimoOperations();
		String answer = "";
		boolean isPrimo=false;
		int number=0;
		
		do 
		{
			System.out.println("Enter any number");
			number = scanner.nextInt();
			isPrimo = esPrimo.isPrimo(number);
			
			if(isPrimo)
				System.out.println(number+" es primo.");
			else
				System.out.println(number+" no es primo.");
			
			System.out.println("Would you like enter other number?");
			answer = scanner.next();
		}
		while(answer.equals("yes") || answer.equals("YES"));

	}

}
