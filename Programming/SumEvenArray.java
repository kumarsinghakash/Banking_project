package com.jspiders;

import java.util.Scanner;

public class SumEvenArray {
	 public static void main(String[] args) {
		 int sum=0;
		Scanner ip=new Scanner(System.in);
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
			if(arr[i]%2==0) {
			sum=sum+arr[i];
			}
		}
		System.out.println("sum of EvenNO. : "+sum);
	}
}
