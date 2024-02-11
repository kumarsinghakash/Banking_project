package com.jspiders;

import java.util.Scanner;

public class Array {
	public static void main(String[] args)
	{
		Scanner ip=new Scanner(System.in);
		int size=ip.nextInt();
		System.out.println("Enter the size of array");
		int[] arr=new int[size];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=ip.nextInt();
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
	}
}
