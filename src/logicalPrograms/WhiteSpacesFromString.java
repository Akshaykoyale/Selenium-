package logicalPrograms;

public class WhiteSpacesFromString {

	public static void main(String[] args) 
	{
		String a = "AK S h a y";
		int counter = 0;
		
		for(int i=0; i<=a.length()-1; i++) 
		{
			char blank = a.charAt(i);
			if(blank==' ') 
			{
				counter++;
			}
		}
      System.out.println("Number of blank spaces in "+ a + " is " + counter);
	}

}
