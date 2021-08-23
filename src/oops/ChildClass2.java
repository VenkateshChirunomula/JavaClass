package oops;

public class ChildClass2 extends ChildClass1{

	@Override
	public void method5() {
		System.out.println("method5 from child Class2 of interface parent inteface");
		
	}
	
	public static void main(String[] args) {
		ChildClass2 c = new ChildClass2();
		c.method1();
		c.method2();
		c.method3();
		c.method4();
		c.method5();
	}

	

}
