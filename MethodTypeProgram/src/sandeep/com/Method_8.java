package sandeep.com;
import java.util.Scanner;
public class Method_8 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Number ? ?");
		int number=sc.nextInt();
		int p=prime_number(number);
		if(p==2)
			System.out.println(" Is Prime Number ");
		else
			System.out.println( " Is Not Prime Number");
	}
	private static int prime_number(int number)
	{
		int divisible_count=1,i=1;
		while(number/2 >=i)
		{
			if(number%i==0)
				divisible_count++;
			i++;
		}
		return divisible_count;
	}
}
/*
Enter Any Number ? ?
7
 Is Prime Number 
*/