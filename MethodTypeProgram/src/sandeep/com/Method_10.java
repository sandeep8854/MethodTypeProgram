package sandeep.com;
import java.util.Scanner;
public class Method_10 
{
	private static int sumOfCube(int num) 
	{
		int sum=0;
		while(num!=0)
		{
			int reminder=num%10;
			sum=sum+reminder*reminder*reminder;
			num=num/10;
		}
		return sum;
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Number ? ?");
		int number=sc.nextInt();
		int s1=sumOfCube(number);
		System.out.println("Sum Of Cube Of individual digit of " +s1);
	}
}
/*
Enter Any Number ? ?
5
Sum Of Cube Of individual digit of 125
*/