package set_A;

public class Emp {
	
	int id;
	String name;
	Float sal;
	
	public Emp(int id, String name, Float sal)
	{
		this.id = id;
		this.name = name;
		
		this.sal =sal;
		
		
	}
	
	public Emp() {
		// TODO Auto-generated constructor stub
	}

	void max(Emp arr[], float a)
	{
		Emp b= new Emp();
		
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i].sal > a)
			{
				b=arr[i];
			}
		}
		
		System.out.println(b.name);
		System.out.println(b.id);
		System.out.println(b.sal);
		
		
	}
	
	void displya()
	{
		System.out.println(id);
		System.out.println(name);
		System.out.println(sal);
		System.out.println();
	}

	public static void main(String[] args) {
	
		Emp arr[]= new Emp[5];
	
		arr[0] =new Emp(1,"sujit",4524f);
		arr[1] =new Emp(2,"abhi",4524f);
		arr[2] =new Emp(3,"sanket",555524f);
		arr[3] =new Emp(4,"sujit",4524f);
		arr[4] =new Emp(5,"sujit",4524f);
	
		
		for(int i =0; i<5; i++)
		{
			arr[i].displya();
		}
		
		float m=arr[0].sal;
		arr[4].max(arr, m);
//		arr[0].displya();
//		arr[2].displya();
//		arr[3].displya();
//		arr[4].displya();
//		arr[5].displya();
//		arr[1].displya();
		
		
		
  
	}

}
