package pattern;

public class Eg10 {

	public static void main(String[] args) {
		 //* * * * * 
		 // * * * * 
		 //  * * * 
		 //   * * 
		 //    *
		
		int space = 0; // No of Space in First Row
		int star = 5; // No of Starts in First Row
		 
		for(int i=1; i<=5; i++) // Outer For Loop
		 { 
		   for(int j=1; j<=space; j++) //Inner For Loop
		 { 
		      System.out.print(" "); 
		 } 
		   for(int k=1; k<=star; k++) //Inner For Loop
		 { 
		     System.out.print("* "); 
		 } 
		 System.out.println(); 
		 space++; 
		 star--; 
		 } 
  } 

}
