package sandeep.com;
import java.util.Scanner;
public class Method_19 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Number ? ?");
		int number=sc.nextInt();
		for(int i=1;i<=10;i++)
		{
			System.out.println(number+ " * " +i+ " = " +(number*i));
		}	
	}
}
/*
Enter Any Number ? ?
10
10 * 1 = 10
10 * 2 = 20
10 * 3 = 30
10 * 4 = 40
10 * 5 = 50
10 * 6 = 60
10 * 7 = 70
10 * 8 = 80
10 * 9 = 90
10 * 10 = 100
*/