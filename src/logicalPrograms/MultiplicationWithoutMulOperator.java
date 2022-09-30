package logicalPrograms;

public class MultiplicationWithoutMulOperator {

	public static void main(String[] args) 
	{
		//2*3--->6
		//2+2+2=6
		
		int num1=2;
		int num2=3;
		int sum=0;
		
		for(int i=1; i<=num2; i++)//1,2,3
		{
			sum=sum+num1;
	       //i=1, sum=0+2=2
		  //i=2, sum=2+2=4
		  //i=3, sum=4+2=6
		}
		System.out.println("Multiplication value is "+sum);
	}

}
