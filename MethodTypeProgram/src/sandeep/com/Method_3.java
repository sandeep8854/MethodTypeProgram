package sandeep.com;
import java.util.Scanner;
public class Method_3
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Number ? ?");
		int number=sc.nextInt();
		int digit=count_Digit(number);
		System.out.println("Number Of Digit "+digit);
		
	}
	private static int count_Digit(int n)
	{
		int count=0;
		do {
			count++;
			n=n/10;
		}while(n!=0);
		return count;	
	}

}
/*
Enter Any Number ? ?
124
Number Of Digit 3
*/