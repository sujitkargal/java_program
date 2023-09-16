//9. Define a class MyNumber having one private integer data
//member. Write a default constructor initialize it to 0 and
//another constructor to initialize it to a value. Write methods
//isNegative, isPositive, isOdd, iseven. Use command line
//argument to pass a value to the object and perform the above
//tests.




package set_A;

public class Ass_a_q9 {

    private int num;
    
    Ass_a_q9()
    {
    	num =0;
    }
    
    Ass_a_q9(int num)
    {
    	this.num =num;
    }
    
    void check() {
    	if(num%2==0)
    		 System.out.println("Even number");
    	if(num%2!=0)
    		 System.out.println("odd number");
    	if(num>0)
    		 System.out.println("positive number number");
    	if(num<0)
    		 System.out.println("nagetive number");
    }
public static void main(String [] sujit)
{
	Ass_a_q9 m1 = new Ass_a_q9();
	System.out.println("number is");
	m1.check();
	
	System.out.println();
	Ass_a_q9 m2 = new Ass_a_q9(-22);
	System.out.println("22 number is number is");
	m2.check();

	
}
}
