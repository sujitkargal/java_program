package sujitK;
import java.util.Scanner;

public class CBSC_count {

		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);

			System.out.println("enter a mark of 5 sub");
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			int d = sc.nextInt();
			int e = sc.nextInt();
			
			float per=  (a+b+c+d+e)/5;
			
			
			
			System.out.println("your CGPA is: "+per);

		}

	}

