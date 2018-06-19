package com.pascal;

public class PascalOperations {

	public void printPascal(int number)
	{
		int sum = 0;
		int oldArr[] = new int[number];
		int newArr[];
		
		for(int i=1 ; i<=number ; i++)
		{
			newArr = new int[i];
			
			for(int j=0 ; j<i ; j++)
			{
				
				if(j==0)
				{
					newArr[j]=1;
					System.out.print("1 ");
				}
				else if(j==(i-1))
				{
					newArr[j]=1;
					System.out.print(" 1");
				}
				else
				{
					sum=oldArr[j-1]+oldArr[j];
					newArr[j]=sum;
					System.out.print(" "+sum+" ");
				}
			}
			oldArr = newArr;
			System.out.println();
		}
	}
}
