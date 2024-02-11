package com.jspiders;

public class recurction {
	static int  i=1;
	static void Demo(int n) {
			if(i<=n)
			{
				int c=1;
				System.out.println(i);
				i++;
				Demo(n);
			}
			
	}
	public static void main(String[] args)
	{
		System.out.println("Start");
		Demo(7);
		System.out.println("End");
	}
}
