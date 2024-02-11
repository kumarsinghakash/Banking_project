package com.jspiders;

public class mainclass {
	public static void main(String[] args) {
		int n=9;
		int square=n*n;
		int sum=0;
		int rem=0;
		while(square!=0)
		{
			rem=square%10;
			sum=sum+rem;
			square=square/10;
		}
		if(n==sum)
		{
			System.out.println("Neon number");
		}
		else
		{
			System.out.println("Not a neon number");
		}
	}
}
