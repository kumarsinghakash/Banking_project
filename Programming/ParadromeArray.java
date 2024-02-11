package com.jspiders;

public class ParadromeArray {
	public static void main(String[] args)
	{
		int [] arr= {1,2,3,4,1,1};
		int n=(arr.length-1)/2;
		int sum=0;
		int sum2=0;
		for(int i=0;i<arr.length;i++)
		{
			if(i<=n)
			{
				sum=sum+arr[i];
			}
			else
			{
				sum2=sum2+arr[i];
			}
		}
		if(sum==sum2)
		{
			System.out.println("ArrayEquilibrium");
		}
		else
		{
			System.out.println("Not ArrayEquilibrium");
		}
	}

}
