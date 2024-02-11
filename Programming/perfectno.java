package com.jspiders;

public class perfectno {
	static int factorial(int n) {
		int fact=1;
		for(int i=1;i<=n;i++) {
			fact=fact*i;
		}
		return fact;
	}
	public static void main(String[] args)
	{
		int n=145,a=n;
		int sum=0;
		int rem=0;
		while(n!=0)
		{
			rem=n%10;
			sum=sum+factorial(rem);
			n=n/10;
		}
		System.out.println(a==sum?"perfect number":"Not a perfect number");
//		if(a==sum) {
//			System.out.println("perfect number");
//		}
//		else {
//			System.out.println("Not a perfect number");
//		}
	}

}
