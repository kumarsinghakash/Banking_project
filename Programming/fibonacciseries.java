package com.jspiders;

public class fibonacciseries {
	public static void main(String[] args)
	{
		int sum=0;
		int n1=0,n2=1;
		while(n1<=1000)
		{
			System.out.println(n1);
			sum=n1+n2;
			n1=n2;
			n2=sum;
		}
	}
}
