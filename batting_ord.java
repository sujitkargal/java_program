package sujitK;

import java.util.Scanner;

public class batting_ord {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
		
		System.out.println("enter a batting avg in 5 enning");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int e = sc.nextInt();
		 b= a+b+c+d+e ;
		System.out.println("the avg of given number is "+b/5);
		

	}

}
