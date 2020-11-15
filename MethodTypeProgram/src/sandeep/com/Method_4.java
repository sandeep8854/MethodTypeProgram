package sandeep.com;
import java.util.Scanner;
public class Method_4 
{
	private static boolean diseriamNumber(int num)
	{
		int sum=0;
		int digit_count=0;
		int temp=num;
		//we count digit of each number so can get the power of each digit
		while(temp!=0)
		{
			temp=temp/10;
			digit_count++;
		}
		//check number of diseriam
		   temp=num;
		   while(temp!=0)
		   {
			    int reminder=temp%10;
			    sum=sum+(int)Math.pow(reminder, digit_count);
			    temp=temp/10;
			    digit_count--;
		   }
		   if(sum==num)
			   return true;
		   else
			   return false;
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Number ? ?");
		int number=sc.nextInt();
		boolean b1=diseriamNumber(number);
		if(b1==true)
			System.out.println("Is a diseriam number.");
		else
			System.out.println("Is Not Diseriam number.");	
	}
}
/*
Enter Any Number ? ?
135
Is a diseriam number.
*/