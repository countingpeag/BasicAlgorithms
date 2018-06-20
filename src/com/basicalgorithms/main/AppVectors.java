package com.basicalgorithms.main;

import com.vectors.Operations;
import com.vectors.Vectors;

public class AppVectors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean[] booleanVect = new boolean[20];
		int[] intVect = {10,20,30,40,50,60,70,80,90,100};
		char[] characterVect= new char[] {'a','b','c','d','e','f'};
		double[] doubleVect = new double[10];
		float[] floatVect = new float[5];
		String[] stringVect = new String[10];
		Vectors[] objVect = new Vectors[20];
		String sentence = "hi";
		
//		System.out.println(characterVect);
//		characterVect = sentence.toCharArray(); 
//		System.out.println(characterVect);
//		
//		for(int i=0 ; i<intVect.length ; i++)
//		{
//			
//		}
		
		int[] arr;
		int sum = 0;
		Operations operations = new Operations(100);
		
		arr = operations.programOne();
		printVector(arr);
		arr = operations.programTwo(1); 
		printVector(arr);
		arr = operations.programTwo(2);
		printVector(arr);
		arr = operations.programThree();
		printVector(arr);
		arr = operations.programFour();
		printVector(arr);
		arr = operations.programFour();
		isEven(arr);
		sum = operations.programFive();
		System.out.println("sum = "+sum);
	}
	
	private static void printVector(int[] arr)
	{
		for(int i=0 ; i<arr.length ; i++)
		{
			System.out.print("["+(i+1)+"]="+arr[i]+" ");
		}
		System.out.println();
		System.out.println();
	}

	private static void isEven(int[] arr)
	{
		int even =0;
		int odd = 0;
		
		for(int i=0 ;i<arr.length ; i++)
		{	
			System.out.print("["+(i+1)+"]=");
			if((arr[i]%2)==0)
			{
				System.out.print(arr[i]+" is even. ");
				even++;
			}
			else
			{
				System.out.print(arr[i]+" is odd. ");
				odd++;
			}
		}
		System.out.println();
		System.out.println("Even="+even+"  Odd="+odd);
		System.out.println();
	}
}
