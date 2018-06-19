package com.numeroprimo;

public class EsPrimoOperations {

	public boolean isPrimo(int number)
	{
		boolean isPrimo = true;
		
		for(int i=2 ; i<number ; i++)
		{
			if((number%2)==0)
			{
				isPrimo=false;
				break;
			}
		}
		
		return isPrimo;
	}
}
