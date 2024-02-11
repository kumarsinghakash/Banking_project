package com.jspiders;
import java.util.Scanner;
public class Typecast {
	static int count(int n) {
		int c=0;
		while(n!=0)
		{
			c++;
			n=n/10;
			
		}
		return c;
	}
	static int power(int base,int ex)
	{
		int pow=1;
		for(int i=1;i<=ex;i++)
		{
			pow=pow*base;
		}
		 return pow;
	}
	public static void main(String[] args)
	{
		//int rem=0,sum=0;
		Scanner ip=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=ip.nextInt();
		int n1=n;
		int ex=count(n);
		
			if(ex%2==0)
			{
				int d=power(10,ex/2);
				System.out.println(n/d+n%d);
			}
			else
			{
				System.out.println("Invalid");
			}
				
	}
}
