package sujitK;

public class jp {
	
	
	//1 program
	
	void hello_world() {
		System.out.println("################1 program ###################");
		System.out.println("hello World");
		
	}
	
	//2 program
	
	void info()
	{
		System.out.println("################2 program ###################");
		System.out.println("Name : sujit");
		System.out.println("Age : 22");
		System.out.println("Add : pune");
		System.out.println("college :BJS ");
		
	}
	
	void is_byte()
	{
		byte  b =  20;
		System.out.println("###############3 program ####################");
		System.out.println("byte with in a range: "+b);
		
//		byte  b =  550;
//		System.out.println("###############4 program ####################");
//		System.out.println("byte out of range : "+b);
		
	}
	
	void Int()
	{
		System.out.println("###############5 program ####################");
		float a = 5;
		System.out.println("int within a range: "+a);
		
//		float b = 65462538586896559;
//		System.out.println("int outof a range: "+b);
		
	}
	
	void Float()
	{
		System.out.println("###############5 program ####################");
		float a = 1.5f;
		System.out.println("float within a range: "+a);
		
//		float b = 1.6;
//		System.out.println("float outof a range: "+b);
		
	}
		void Long()
		
		{
			System.out.println("###############6 program ####################");
//			long a= 6852695856759;
//			System.out.println("long outoff a range: "+a);
//			

			long a= 6956759;
			System.out.println("long within  a range: "+a);
			
			
			
		}
		
		void Double()
		{
			System.out.println("###############8 program ####################");
			double a = 58857876.85288;
			System.out.println("double within  a range: "+a);
			
//			double b = 5885787685288;
//			System.out.println("double outoff  a range: "+b);
//			
			
		}

		void comment()
		{
			System.out.println("###############11 program ####################");
			
//			hegechnwycgneygkwexyh
//			ethrvhrecvjhrcvrt
//			rtvhrechedtjh
//			scehrtcjhrefj
		}
		
	void Odd_even()
	{
		System.out.println("###############12 program ####################");
		
		int a= 50;
		
		if (a%2 == 0)
		{
			System.out.println("given number "+ a +" is even");
			
		}
		
		else {
			
			System.out.println("given number "+ a +" is ODD");
			
			
		}
		
	}
	
	
	void leap_year()
	
	{
		System.out.println("###############13 program ####################");
		int year =2024;
		
		if (year/4 == 0)
		{
			System.out.println("given Year "+ year +" is even");
			
		}
		
		else {
			
			System.out.println("given Year "+ year +" is ODD");
			
			
		}
	}
	
	
	void _0to10()
	
	{
		System.out.println("###############20 program ####################");
		System.out.println("1 to 10 numbers");
		for(int i=1; i<=10; i++)
		{
			System.out.println(i);
		}
	}
	
	

	
 public static void main( String arg [])
 {
 
	 jp a = new jp();
	 
	 a.hello_world();
	 a.info();
	 a.is_byte();
	 a.Int();
	 a.Float();
	a.Long();
	a.Double();
    a.comment(); 
	a.Odd_even();
	a.leap_year();
	a._0to10();
	
	 
 }

}
