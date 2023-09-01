package sujitK;
import java.util.*;
public class Q3 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int a[] =new int[10];
		
		
		System.out.println("enter a array");
		for(int i=0; i<10; i++ )
		{
			 a[i]= sc.nextInt();
		}
		
		System.out.println("Given array is ");
		for(int i=0; i<10; i++ )
		{
			System.out.print(a[i]+" ");
		}
		
		System.out.println(" ");
		System.out.println("Revers array ");
		
		for(int i=9; i>=0; i-- )
		{
			System.out.print(a[i]+" ");
		}
		
	}

}
