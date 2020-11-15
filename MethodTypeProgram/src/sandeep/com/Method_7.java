package sandeep.com;

import java.util.Scanner;

public class Method_7
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Number ? ?");
		int number=sc.nextInt();
		boolean c=primeMethod(number);
		if(c==true)
			System.out.println("Is Prime Number");
		else
			System.out.println("Not a Prime number");
	}

	private static boolean primeMethod(int number)
	{
		int i=2;
		while(number/2 >=i)
		{
			if(number%i==0)
				return false;
			i++;
		}
		return true;
	}
}
/*
Enter Any Number ? ?
5
Is Prime Number
*/