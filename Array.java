package set_A;
import java.util.*;
public class Array {

	public static void main(String[] args) {
		
//		int a[]= {1,2,3,4,5,5};
//		
//		for (int b=0  )
//		
		
		Scanner sc = new Scanner(System.in);
		
		
		int a[]= new int [5];
		System.out.println("enter a number:");
		for(int i=0; i<5; i++)
		{
			a[i] = sc.nextInt();
		}
		
		int sum =0;
		
			for(int i=0; i<5; i++)
			{
				sum= sum +a[i];
				//System.out.println("sum" +sum);
			}
			
			System.out.println("sum" +sum);
			
		
	}

}
