package javaBasics;

public abstract class Multipleinheritance extends Child implements ParentInterface{

	@Override
	public void main() {
		System.out.println("main method");
	}

	@Override
	public void method2() {
		System.out.println("method2 ");
		
	}
	
	//abstract class --> which will have abstract methods and non abstract methods
 // multiple inheritance --> inheriting two classes --- not possible in java 
	
	//to inherit from interface we must use implements keyword.
	
 //Child class having method -- method1();
 //Parent class having method -- method1();
 // like class we have interface
	
	//interface -- only have abstract methods;
}
