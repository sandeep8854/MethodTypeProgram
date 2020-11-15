package sandeep.com;

import java.util.Scanner;

public class Method_13 
{
	private static void fibonoacci(int num)
	{
		int i=1,temp1=0,temp2=1;
		while(num>=i)
		{
			System.out.print(" "+temp1);
			int sum=temp1+temp2;
		            temp1=temp2;
		            temp2=sum;
		            i++;
		}	
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter Any Number to find between Fibonacci series ? ?");
		int number=sc.nextInt();
		fibonoacci(number);	
	}
}
/*
Enter Any Number to find between Fibonacci series ? ?
10
 0 1 1 2 3 5 8 13 21 34
*/