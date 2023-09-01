package sujitK;

import java.util.Iterator;
import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
	
		int f1=0;
		int f2=1;
		
		
			System.out.println("enter a size  ");
			int a = sc.nextInt();
			
			
			System.out.print("Fibonacci "+ f1+ " "+f2+ " " );
			
			 for(int i =0; i<a-2;i++)
			 {
				 int f3 =f1+f2;
				 System.out.print(f3+ " " );
				 f1=f2;
				 f2=f3;
			 }

	}

}
