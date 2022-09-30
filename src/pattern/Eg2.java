package pattern;

public class Eg2 {

	public static void main(String[] args)
	{   // ******
		// ******
		// ******
		// ******
		// ******
		
		//rows--->5  columns--->6
		//External for loop for rows & internal for loop for columns
		
		for(int i=1; i<=5; i++)//--->row
		{
			for(int j=1; j<=6; j++)//--->column
			{
				System.out.print("*");
			}
			System.out.println("*");
		}
	}
}
