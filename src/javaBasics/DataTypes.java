package javaBasics;

public class DataTypes {

	public static void main(String[] args) {
		//add();
		//multply();
		//add();
		add(200, 8);
		//add(300, 250);
		//substract();
		
		//error();
		
	}
	//non param methods
	// +-/ 
	public static  void add()
	{
		int i = 20;
		int j = 30;
		System.out.println(i+j);
		
	}
	public static void multply()
	{
		
		int i = 20;
		int j = 30;
		System.out.println(i*j);
	}
	//parameterized methods
	public static void add(int i , int j)
	{
		System.out.println(i+j);
		
		String s1 = "Venkat";
		String s2 = "200";
		System.out.println(s1+" "+s2);
	}
	
	public static void substract()
	{
		float k = 200.00f;
		int a = 0;
		
		double z =k/a;
		
		System.out.println(z);
	}
	
	public static void empname()
	{
		String s = "i am venkatesh";
		//string is immutable 
		
		StringBuilder s1 = new StringBuilder();
		
		s1.append(s);
		
		System.out.println(s1.reverse());
		
		StringBuffer s2 = new StringBuffer(s);
		
		System.out.println(s2.reverse());
		System.out.println(s2.replace(1, 5, s));
		
		
		
	//	System.out.println(s);
		
	}
	
	public static void error()
	{
		int a =20 ; 
		int b = 25;
		if (a==b) {
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}
		
	}

}
