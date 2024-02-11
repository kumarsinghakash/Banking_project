package com.jspiders;

import java.util.Scanner;

public class StringDemo1 {
	public static void main(String[] args)
	{
		Scanner ip=new Scanner(System.in);
		System.out.println("Enter the String value");
		String s=ip.next();
		int sum=0;
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(c>='0'&&c<='9')
			{
				sum=sum+(c-48);
			}
		}
		System.out.println(sum);
	}

}
