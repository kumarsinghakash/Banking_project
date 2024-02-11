package com.jspiders;

import java.util.Scanner;

public class KEYARRAY {
	public static void main(String[] args)
	{
		Scanner ip=new Scanner(System.in);
		int [] arr= {4,3,2,1,15,2,3};
		System.out.println("Enter the key value: ");
		int key=ip.nextInt();
		int  pos=-1;
		for( int i=0;i<arr.length;i++)
		{
			if(arr[i]==key)
			{
			  pos=i;
			  break;
			}
			
		}
		System.out.println(pos);
		
		
	}
}
