package com.jspiders;

public class PolidromeNumber {
	public static void main(String[] args)
	{
		int n=1234321;
		int n1=n;
		int rem=0;
		int rev=0;
		while(n!=0)
		{
			rem=n%10;
			rev=(rev*10)+rem;
			n=n/10;
		}
		if(n1==rev)
		{
			System.out.println("Polidrome Number");
		}
		else
		{
			System.out.println("Not Polidrome Number");
		}
	}

}
