package com.jspiders;

public class pnumber {
	static boolean isprime(int n)
	{
		int c=0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				c++;
			}
		}
		return c==2;
	}
	public static void main(String[] args)
	{ 
//		int n=5;
//		int c=0;
//		int j;
//		for(int i=1;;i++)
//		{
//			for(j=2;j<=i;j++)
//			{
//				if(i%j==0)
//				{
//					break;
//				}
//			}
//			if(i==j)
//			{
//				c++;
//				if(n==c) {
//					System.out.println(i);
//					break;
//				}
//			}
//		}
		int n=6,c=0;
				for(int i=1;;i++)
				{
					if(isprime(i)) {c++;};
					if(c==0)
						System.out.println(i);break;
				}
	}
}
