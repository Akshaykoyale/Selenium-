package logicalPrograms;

public class ReverseNumberWithoutStringConvert {

	public static void main(String[] args)
	{

		int number=123;
		int revNum=0;
		// System.out.println(number/10);
		// System.out.println(number%10);
		// System.out.println(12/10);
		// System.out.println(12%10);
		for(int i=number;i>0;i=i/10)//123,12,1
		{
		int rem =i%10;//3, 2, 1
		revNum=revNum*10+rem;
		//3=10*0+3
		//32 =3*10+2
		//321=32*10+1
		}
		System.out.println(revNum);

	}

}
