package javaBasics;

public class Constructors extends ParentConstructor  {

	
	int i = 10 ; 

// constructors is a bock of code which will execute before execution of actual program
// constructor name should be same as class name.
// constructor wont return anything	
	public Constructors(int i)
	{	
	    super(i);
		
		System.out.println("constructor");
	}
	
	
	public void add()
	{
		System.out.println(i);
	}
	public void method2()
	{
		System.out.println(i);
		System.out.println(this.i);
		System.out.println(super.i);
	}
	public static void main(String[] args) {
	
		new Constructors(205).method2();
		
	}
	
}