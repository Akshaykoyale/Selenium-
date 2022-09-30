package logicalPrograms;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		//String, integer, Float, char
		
		System.out.println("Please enter your name");
		String name = sc.next();
		System.out.println("You enter name is "+ name);
		
		System.out.println("Please Enter 1st Number");
		int number1 = sc.nextInt();
		System.out.println("Please Enter 2nd Number");
		int number2 = sc.nextInt();
		int sum = number1+number2;
		System.out.println("Addition of two number is "+sum);
		
		
	}

}
