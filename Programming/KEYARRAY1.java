package com.jspiders;

import java.util.Scanner;

public class KEYARRAY1 {
	public static int key(int[] arr,int key)
	{
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==key)
			{
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args)
	{
		Scanner ip=new Scanner(System.in);
		int [] arr= {4,3,2,1,15,2,3};
		System.out.println("Enter the key value: ");
		int key=ip.nextInt();
		System.out.println(key(arr,key));
		
		
	}
}

