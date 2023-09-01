package sujitK;

import java.util.Scanner;

public class Discount_product {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	
     int di=8;	
	
		System.out.println("enter the Prise of product");
		
		int a = sc.nextInt();
		
		System.out.println("Discount Prise is"+ (a * di/100)+"%");
	}

}
