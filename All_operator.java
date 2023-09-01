package sujitK;

import java.util.Scanner;

public class All_operator {
	
	
	
	void Airthmatic()
	{
		
		System.out.println("Airthmatic oprator");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter a 2 numbers");
		
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println(" Add is:   "+(+a+b));
		System.out.println(" sub is:   "+ (a-b));
		System.out.println(" div is:   "+(a/b));
		System.out.println(" multi is: " + (a*b));
		
	}
	
	void logical()
	{
		System.out.println("Airthmatic oprator");
		Scanner sc = new Scanner(System.in);

		System.out.println("enter a 100 or 50 numbers");
		
		int num1=sc.nextInt();
		
		if(num1 == 100 || num1 ==50 )
		{
			System.out.println("you are enter correct number");
			
		}
		else
		{
			System.out.println("you are enter WRONG number");
		}
		
		
	}
	
	
	void comp()
	{
		System.out.println("comparison oprator");
		Scanner sc = new Scanner(System.in);

		System.out.println("enter a 2 numbers");
		
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		
		if(num1 < num2  )
		{
			System.out.println("num2 is grater" );
			
		}
		else
		{
			System.out.println("num1 is grater");
		}
		
	}
	
	
	
	
	
	

	public static void main(String[] args) {
		
		All_operator a = new All_operator();
		a.Airthmatic();
		System.out.println();
		a.logical();
		System.out.println();
        a.comp();
        
        
	}

}
