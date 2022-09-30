package pattern;

public class Eg3 {

	public static void main(String[] args)
	{   //*
		//**
		//***
		//**** 
		//*****
		int star = 1;
		
		for(int i=1; i<=5; i++) //outer for loop for rows
		{
			for(int j=1; j<=star; j++)
			{
				System.out.print("*");
			}
			star++;
			System.out.println("");
		}

	}

}
