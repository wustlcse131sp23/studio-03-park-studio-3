package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		// initialize
		System.out.println("Please enter the upper bound of numbers: ");
		int initialNumber = in.nextInt();
		
		int [] numberArray;
		numberArray = new int[initialNumber];
		
		for (int i = 0; i < initialNumber; i++)
			numberArray[i] = i + 1;
		

		int [] resultArray;
		resultArray = new int[initialNumber];
		
		int countPrime = 0;
		for (int i = 0; i < initialNumber; i++)
		{
			if ((numberArray[i] % 2) != 0 && (numberArray[i] % 3) != 0 && (numberArray[i] % 5) != 0)
				{
				resultArray[i] = i + 1;
				
				countPrime += 1;
				}
		}
		
	
		int [] finalArray;
		finalArray = new int[countPrime];
		int count = 0;
		
		
		for (int i = 0; i < initialNumber; i++)
		{
			if (resultArray[i] !=0)
			{	
				finalArray[count] = resultArray[i];
				count += 1;
			}
		}
		
		for (int i1 = 0; i1 < countPrime; i1++)
			System.out.println(finalArray[i1]);
	}


}

