package javaBasics;


public class Examples {
	
	public static void main(String[] args) {
		reverseString();
	}
	public static void reverseString()
	{
		String s ="i am tester";
		//retset ma i
		//'i',' ' ,'a','m'
		//'11'  --10
		
		char[] c =s.toCharArray();
		
		//System.out.println(c[1]);
		//20 == 0 
		//i-- = i-1
		
		
		
		for(int i= 10; i>=0 ;i--) // 10 , 10-1=9 , 9-1= 8 , 8-1 = 7 .... 1-1= 0 
		{
			//System.out.print(c[i]);
		}
		
		//
		
		StringBuilder s1 = new StringBuilder();
		s1.append("2589695");
		s1.append("Venkat");
		s1.append("rajesh");
		System.out.println(s1.reverse());
		
		StringBuffer s2 = new StringBuffer(s);
		System.out.println(s2.reverse());
		
	}

}
