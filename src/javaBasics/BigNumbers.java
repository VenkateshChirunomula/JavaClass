package javaBasics;

import java.math.BigInteger;

public class BigNumbers {

		

	//factorial 
	//5! = 5*4*3*2*1
	//25! = 24
	//7 -- int
	//11 -- long int 
	//11+ digits BigInteger
	public static void main(String[] args) {
		int factorial =1;
		int num = 50;
		BigInteger b = new BigInteger("1");
		for(int i = num; i>=1;i-- )
		{
			
			b = b.multiply(BigInteger.valueOf(i));
		}
		System.out.println(b);
		
	}
}




