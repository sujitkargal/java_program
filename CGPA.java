package sujitK;

import java.util.Scanner;

public class CGPA {

	public static void main(String[] args) {
		
		
		
		System.out.println("enter a mark of 4 sub");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		
		float per=  (a+b+c+d)/4;
		
		float cgpa =  per / 9.5f;
		
		System.out.println("your CGPA is: "+cgpa);

	}

}
