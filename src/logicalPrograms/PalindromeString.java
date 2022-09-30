package logicalPrograms;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter String");
		String s = sc.next();
		String r = "";
		for (int i=s.length()-1; i>=0; i--)
		{
			r=r+s.charAt(i);
		}
		System.out.println("Original String is "+s);
		System.out.println("Reverse String is "+r);
		
		if (s.equalsIgnoreCase(r))
		{
			System.out.println("Given String is Palindrome");
		}
		else
		{
			System.out.println("Given string is not Palindrome");
		}
	}

}
