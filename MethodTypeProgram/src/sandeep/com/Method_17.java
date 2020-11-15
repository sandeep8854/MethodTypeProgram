package sandeep.com;
import java.util.Scanner;
public class Method_17 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First Number ??");
		int first=sc.nextInt();
		
		System.out.println("Enter Second Number ??");
		int second=sc.nextInt();
		
		System.out.println("Enter Third Number ??");
		int third=sc.nextInt();
		
		if((first > second && first < third ) || (first > third && first < second))
		{
			System.out.println(first + " Is middle values..");
		}else if((second >third && second < first ) || (second > first && second < third))
		{
			System.out.println(second + " Is middle values.. ");
		}
		else
		{
			System.out.println(third + " Is middle vlaues..");
		}
	}
}
/*
Enter First Number ??
45
Enter Second Number ??
65
Enter Third Number ??
89
65 Is middle values.. 
*/