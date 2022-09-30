package logicalPrograms;

public class ArmStrongNumber {

	public static void main(String[] args)
	{
		
		//123-->1^3+2^3+3^3=1+8+27=36
		//153-->1^3+5^3+3^3=1+125+27=153
		int number=153;
		int sum=0;
		for(int i=number;i>0;i=i/10)//153
		{
		int rem=i%10;//3
		sum=sum+(rem*rem*rem);
		}
		//System.out.println(sum);
		if(number==sum)
		{
		System.out.println("Given number is armstrong number");
		}
		else {
		System.out.println("Given number is not armstrong number");
		}
		

	}

}
