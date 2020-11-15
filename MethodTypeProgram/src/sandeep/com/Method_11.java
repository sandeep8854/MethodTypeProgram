package sandeep.com;
import java.util.Scanner;
public class Method_11 
{
	//sum of cubes of each digit is equal to number itself 153
    //For example: 153 = 1*1*1 + 5*5*5 + 3*3*3 // 153 is an Armstrong number
private static boolean armstrongNumber(int num) 
{
int sum=0,temp=num;
do {
int reminder=num%10;
sum=sum+reminder*reminder*reminder;
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
boolean b1=armstrongNumber(number);
if(b1==true)
System.out.println("Is A Armstrong Number. .");
else
System.out.println("Is Not Armstrong Number..");
}

}
/*
Enter Any Number ? ?
153
Is A Armstrong Number. .
*/