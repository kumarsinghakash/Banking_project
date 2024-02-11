package com.jspiders;

import java.util.Scanner;

public class OneTwoThree {
	static int Sumof(int size)
	{
		Scanner ip=new Scanner(System.in);
		//int size1=ip.nextInt();
		int sum=0;
		int[] arr=new int[size];
		if(arr.length==0)
		{
			return 0;
		}
		else
		{
			System.out.println("Enter the value of array");
			for(int i=0;i<arr.length;i++)
			{
				arr[i]=ip.nextInt();
			}
			for(int i=0;i<arr.length;i++) {
				if(arr[i]==13)
				{
					i++;
				}
				else {
					sum=sum+arr[i];
				}
			}
			return sum;
		}
	}
	public static void main(String[] args)
	{
		Scanner ip=new Scanner(System.in);
		System.out.println("Enter the Size of array");
		int size=ip.nextInt();
		System.out.println(Sumof(size));
	}
}
