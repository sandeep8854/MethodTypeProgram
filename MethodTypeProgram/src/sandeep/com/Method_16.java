package sandeep.com;

import java.util.Scanner;

public class Method_16 
{
	private static void sumofNatural(int n) 
	{
		int sum=0;
		while(n>0)
		{
			sum=sum+n;
			n--;
		}
		System.out.println("sum is " +sum);
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Number ? ?");
		int number=sc.nextInt();
		sumofNatural(number);	
	}
}
/*
Enter Any Number ? ?
10
sum is 55
*/