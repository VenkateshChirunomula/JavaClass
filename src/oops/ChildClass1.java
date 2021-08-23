package oops;



public abstract class ChildClass1 extends ParentClass implements ParentInterface 
{

	@Override
	public void method2() {
		
		System.out.println("method2 from child Class1 of interface parent inteface");
		
	}

	@Override
	public void method3() {
		System.out.println("method3 from child Class1 of interface parent inteface");
		
	}

	@Override
	public void method4() {
		System.out.println("method4 from child Class1 of interface parent inteface");
		
	}
	
	public abstract  void method6();

	
}
