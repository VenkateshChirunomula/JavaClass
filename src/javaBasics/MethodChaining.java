package javaBasics;

public class MethodChaining {
	//Linking of methods
	
	public MethodChaining  add(int a , int b)
	{
		System.out.println(a+b);
		return this;
	}
	
	public MethodChaining substract(int a , int b)
	{
		System.out.println(a-b);
		return this;
	}
	public Arrays multiply(int a , int b)
	{
		System.out.println(a*b);
		
		return new Arrays();
	}
}
