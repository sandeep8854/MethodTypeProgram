package sandeep.com;

import java.util.Scanner;

public class Method_22 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the First Subject Marks");
		int subj1=sc.nextInt();
		System.out.println("Enter The Second Subject Marks " );
		int subj2=sc.nextInt();
		System.out.println("Enter The Third Subject Marks ");
		int subj3=sc.nextInt();
		System.out.println("Enter The Four Subject Marks ");
		int subj4=sc.nextInt();
		
		//if(subj1>=33 && subj2>=33 && subj3>=33 && subj4>=33)
		if(subj1<33 ||subj2<33 ||subj3<33||subj4<33)	
		//	System.out.println("You are Passed!");
			System.out.println("fail");
		else
		//	System.out.println("You are Failed!");
			System.out.println("pass");
	}

}
/*
Enter the First Subject Marks
45
Enter The Second Subject Marks 
65
Enter The Third Subject Marks 
85
Enter The Four Subject Marks 
46
pass
*/