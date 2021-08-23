package javaBasics;

public class Child extends Parent{
	
	//single level inheritance --> inheriting single class 
	// to inherit any class to current class we must use extends keyword and the parent class name 
	
	// in case if you want to inherit a class use --> extends keyword.
	public Child() {
		System.out.println("Child class constructor");
	}
	
	
	public void methodChild() // non static method
	{
		System.out.println("Child class method");
	}
	
	public static void main(String[] args) {
		Child c = new Child();
		c.methodChild();
		c.methodParent();
	}
}
