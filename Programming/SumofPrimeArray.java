package com.jspiders;

import java.util.Scanner;

public class SumofPrimeArray {
//	static int PrimeArray(int n)
//	{
//		int i=2,c=0;
//		for( i=2;i<n;i++)
//		{
//			if(n%i==0)
//			{
//				c++;
//			}
//		}
//		if(n==i)return n;
//	}
public static void main(String[] args) {
		
		Scanner ip=new Scanner(System.in);
		int sum=0,j;
		System.out.println("Enter the size of array");
		int size=ip.nextInt();
		int[] arr=new int[size];
		System.out.println("Enter the value of array");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=ip.nextInt();
		}
		for(int i=0;i<arr.length;i++)
		{
			for(j=2;j<arr[i];j++)
			{
				if(arr[i]%j==0)
				{
					break;
				}
			}
			if(j==arr[i]) 
				sum=sum+arr[i];
			}
		System.out.println("Sum of Prime Array: "+sum);
	}
}
