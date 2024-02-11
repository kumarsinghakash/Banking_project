package com.jspiders;

public class Recursion {
	static void Demo(int n)
	{
		if(n>=1)
		{  
			
			System.out.println(n); 
			Demo(n-1);
			System.out.println(n);
			
		}
		else
		{
			System.out.println(0);
		}

	}
	public static void main(String[] args)
	{
		Demo(3);
	}
}
