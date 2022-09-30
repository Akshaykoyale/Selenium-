package logicalPrograms;

import java.util.Scanner;

public class ReverseTheNumber {

	public static void main(String[] args) 
	{
          Scanner sc = new Scanner(System.in);
          System.out.println("Please enter number");
          int number = sc.nextInt();
          System.out.println("You enter number is "+number);
		 
          String s=Integer.toString(number);
          String r="";
         
          for(int i=s.length()-1;i>=0;i--)
          {
          r=r+s.charAt(i);
          }
          
          int revNumber = Integer.parseInt(r);
         
          System.out.println("Original number is "+number);
          System.out.println("Reverse number is "+revNumber);
	}

}
