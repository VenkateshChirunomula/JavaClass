package javaBasics;

public class Methods {
	
	public static void main(String[] args) {
		System.out.println(method2());
		
		// ClassName c = new ClassName();
		Methods m = new Methods();
		
		System.out.println(m.method1());
		m.method3();
		System.out.println(m.method3());
	
	}
	
	public int method1() //non static method -- void means nothing or empty
	{ // not expecting any return we declare that as void 
		int i = 0 ;
		int c = 100;
		
		//System.out.println(i+c);
		
		return  i+c;
	}
	public static int method2() //static method 
	{
		int i = 0 ;
	    int c = 2;
	
	   //System.out.println(i+c);
	   
	   return  i+c;
	}
	public String method3()
	{
		String a = "Venkat";
		String b = "Ch";
		String c= a.concat(b);
		
		return c;
	}
	

}
