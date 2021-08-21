package javaBasics;

public class Arrays {
	
	public static void main(String[] args) {
		int i = 10 ;
		int j = 20 ;
		int k = 30 ;
		int a = 40 ;
		int b = 50 ;
		int c = 60 ;
		// Arrays
		// intger array 
		// string array 
		// char array -- useful
		// long array 
		
		int[] arr =new int[600];
		arr[0] = 1; // 1
		arr[1] = 2; //2
		arr[2] = 3;//3
		arr[3] = 3;//4
		arr[4] = 3;//5
		arr[5] = 5;
		//128gb mobile
		// u dont have any data in that 2gb mobile
		
		int[] abs = {1,2,3,4,5,5,6};
		System.out.println(arr[595]);
		//StringArray();
		charArray();
	}
	
	public  Loops StringArray()
	{
		String[] strarray = new String[10];
		strarray[0]="Venkat";
		strarray[1] ="Tester";
		System.out.println(strarray[1]);
		
		String[] names = {"ve" ,"ce" ,"de" , "jp"};
		
		System.out.println(names[1]);
		System.out.println(names.length);
		return new Loops();
	}
	public static void charArray()
	{
		char[] chararr = new char[2];
		chararr[0]='A';
		chararr[1]='B';
		char[] c = {'c','d','e','f'};
		
		System.out.println(c[2]);
	}
}
