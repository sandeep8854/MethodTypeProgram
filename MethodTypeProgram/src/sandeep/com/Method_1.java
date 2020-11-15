package sandeep.com;
import java.util.Scanner;
public class Method_1
{
	private static int  findPower(int base1,int power1) 
	{
		int powerStored=1;
		while(power1>0)
		{
			powerStored=powerStored*base1;
			power1--;
		}
		return powerStored; 		
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Base Number ? ?");
		int base=sc.nextInt();
		System.out.println("Enter Power Number ? ?");
		int power=sc.nextInt();
		int p1=findPower(base,power);
		System.out.println(p1);
	}
}
/*
Enter Base Number ? ?
2
Enter Power Number ? ?
2
4
*/