package sandeep.com;

import java.util.Scanner;

public class Method_15
{
	/*
	 A number is called strong number if sum of the factorial of its digit is equal to
	  number itself. For example: 145 since.
     So, 145 is a Strong number. ...
	 */
	private static boolean strongNumber(int num)
	{
		int sum=0,temp=num;
		do {
			int reminder=num%10;
			int factorial=1;
			while(reminder>1)
			{
				factorial=factorial*reminder;
				reminder--;
			}
			
			sum=sum+factorial;
			num=num/10;
			
		}while(num!=0);
		if(sum==temp)
			return true;
		else
			return false;
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Number ? ?");
		int number=sc.nextInt();
		boolean b1=strongNumber(number);
		if(b1==true)
			System.out.println("Is A Strong Number..");
		else
			System.out.println("Is not Strong Number..");
	}
}
/*
Enter Any Number ? ?
145
Is A Strong Number..
*/