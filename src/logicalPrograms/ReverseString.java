package logicalPrograms;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args)
	{
		//String s= "Akshay";
		// i want print Akshay in reverse order--> yahskA
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter string");
		String s = sc.next();
		
		String r = " ";
		
		for(int i=s.length()-1; i>=0; i--)//1,2,3,4,5
		{
			r=r+s.charAt(i);	
		}
		System.out.println("Reverse String is "+r);
		
	}

}
