package com.jspiders;
import java.util.Scanner;

public class ArmstrongNumber {
	static int count(int n)
	{
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
//		int num=153,n=num;
		System.out.println("Enter the Number: ");
		Scanner ip=new Scanner(System.in);
		int num=ip.nextInt();
		int n=num;
		int rem=0;
		int sum=0;
		int c=count(num);
		while(num!=0)
		{
			rem=num%10;
			sum=sum+power(rem,c);
			num=num/10;			
		}
		if(n==sum)
		{
			System.out.println("ArmstrongNumber");
		}
		else
		{
			System.out.println("Not ArmstrongNumber");
		}
	}

}
