package logicalPrograms;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) 
	{
		// Prime Number means the number who divided by 1 & its own only
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter number");
		int num = sc.nextInt();
		System.out.println("You enter number is "+ num);
		
		int counter =0;
		
		for(int i=2; i<num; i++)
		{
			if(num%i==0)
			{
				counter++;
				break;
			}
		}
		
		if (counter==1)
		{
			System.out.println("Given number is not a prime number");
		}
		else 
		{
			System.out.println("given number is prime number");
		}
	}

}
