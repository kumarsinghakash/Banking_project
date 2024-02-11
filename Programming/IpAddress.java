package com.jspiders;

import java.util.Scanner;
public class IpAddress {
	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		boolean flag=true;
		System.out.println("Enter the Ip Address");
		String  s="12.123.123.123";
		String[] arr=s.split("[.]");
		if(arr.length==4)
		{
			for(String ele:arr)
			{
				int n=Integer.parseInt(ele);
				if((n<0)||(n>255))
				{
					flag=false;break;
				}
			}
		}
		else {
			flag=false;
		}
		System.out.println(flag==true?"valid":"Invalid");
		
	}

}
