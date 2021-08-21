package javaBasics;

import java.util.Iterator;



@SuppressWarnings("unused")
public class Loops {
	public static void main(String[] args) {
		//forloop();
		//ifelse();
		//nestedifelse();
		whileloop();
	}

	// for , if else , while , do while 

	//1 - 100
	public static void forloop()
	{
		//int j= 258;
		//starting =1 and end = 100 1 , 1+1 = 2 , 2+1= 3 
		for(int i =2; i<=5; i++)
			
			//iteration 1 i =2 
			//iteration 2 i = 3
		{
			for(int j= 1 ;j<=10;j++)
			{

				System.out.println(j+" "+" X " +i+" = "+j*i);
				
				if (j==3) {
				//	break;
				}
			}
		}
	}
	public static void ifelse()
	{
		int a = 200 ;                   //if
										//if else
										//else
		int b = 200 ;
		
		if (a!=b) { // != not equal 
			System.out.println("not equal");
		}
		else {
			System.out.println("equal");
		}
	}
	public static void nestedifelse()
	{
		int a = 20 ;
		int b = 25;
		int c = 30;
		
		if (a==b) {
			System.out.println("a and b both same");
		}
		else if (b==c) {
			System.out.println("b and c both same");
			
		}
		else {
			System.out.println("nothing is same");
		}
	}
	public static void whileloop()
	{
		//it works based on boolean value
		int i = 0 ;
		while(i<=7)
		{
			System.out.println("while loop");
			i++;
			if (i == 6) {
				break;
			}
		}
	}
}
