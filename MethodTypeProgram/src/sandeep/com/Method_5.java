package sandeep.com;

import java.util.Scanner;

public class Method_5
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First Number  ? ? ");
		int num1=sc.nextInt();
		System.out.println("Enter Second Number ? ?");
		int num2=sc.nextInt();
		int c=min_numFunction(num1, num2);
		System.out.println("Minimum NUmber is "+c );
		
	}

	private static int min_numFunction(int num1, int num2)
	{
		int min;
		if(num1 >num2)
			min=num2;
		else
			min=num1;

		return min;
	}
}
/*
Enter First Number  ? ? 
45
Enter Second Number ? ?
46
Minimum NUmber is 45
*/