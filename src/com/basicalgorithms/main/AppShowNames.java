package com.basicalgorithms.main;

import java.util.Scanner;

public class AppShowNames {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String sName="";
		
		System.out.println("Enter your name:");
		sName = scanner.nextLine();
		
		//for Loop
		/*for(int count=0 ; count<10 ; count++)
		{
			System.out.println("Hi "+ sName + (count+1));
		}*/
		
		//While Loop
		/*int count=0;
		while(count<10)
		{
			System.out.println("Hi "+ sName + (count+1));
			count++;
		}*/
		
		//do while Loop
		int count=0;
		do 
		{
			System.out.println("Hi "+ sName + (count+1));
			count++;
		}
		while(count<10);
	}

}
