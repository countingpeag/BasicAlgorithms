package com.vectors;

import java.util.Random;

public class Operations {

	private int[] arr;
	private int numItems=0;
	
	public Operations(int numItems)
	{
		this.arr = new int[numItems];
	}
	
	public int[] programOne()
	{
		
		for(int i=0 ; i<arr.length ; i++)
		{
			arr[i] = 1; 
		}
		
		return arr;
	}
	
	public int[] programTwo(int increment)
	{
		
		int count = increment;
		
		for(int i=0 ; i<arr.length ; i++)
		{
			arr[i] = count;
			count += increment;
		}
		
		return arr;
	}
	
	public int[] programThree()
	{
		
		int count = 0;
		
		for(int i=arr.length ; i>0 ; i--)
		{
			arr[count] = i;
			count++;;
		}
		
		return arr;
	}
	
	public int[] programFour()
	{
		Random rnd = new Random(System.nanoTime());
		
		for(int i=0 ; i<arr.length ; i++)
		{
			arr[i] = rnd.nextInt(100);
		}
		
		return arr;
	}
	
	public int programFive()
	{
		
		for(int i=0 ; i<arr.length ; i++)
		{
			arr[i] = i+1;
		}
		
		return sumVector(arr);
	}
	
	private int sumVector(int[] arr)
	{
		int sum = 0;
		for(int i=0 ; i<arr.length ; i++)
		{
			sum += arr[i];		
		}
		
		return sum;
	}
	
}
