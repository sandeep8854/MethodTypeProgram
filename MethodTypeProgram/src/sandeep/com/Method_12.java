package sandeep.com;
import java.util.Scanner;
public class Method_12
{
	private static void factorial(int num) 
	{
		int fact=1;
		while(num>1)
		{
			fact=fact*num;
			num--;
		}
		System.out.println(fact);	
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Number  ? ? ?");
		int number=sc.nextInt();
		factorial(number);	
	}
}
/*
Enter Any Number  ? ? ?
5
120
*/