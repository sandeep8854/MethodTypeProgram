package sandeep.com;
import java.util.Scanner;
public class Method_6 
{
	private static boolean polindromeMethod(int num)
	{
		int reverse=0,temp=num;
		do {
			int reminder=num%10;
			reverse=reverse*10+reminder;
			num=num/10;

		}while(num!=0);
		if(reverse==temp)
			return true;
		else
			return false;
	
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Number ? ?");
		int number=sc.nextInt();
	boolean b1=polindromeMethod(number);
		
		if(b1==true)
			System.out.println(" Is A Polindrome Number ..");
		else
			System.out.println(" Is not Polindrome Number..");
			
	}
}
/*
Enter Any Number ? ?
5
Is A Polindrome Number ..
 */
