package com.jspiders;

import java.util.Scanner;

public class ReverseFourCharOfString {
	 public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		System.out.println("Enter the String ");
		String s=ip.next();
		String s1="";
		String s2="";
		int n=s.length()/2;
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(i<=n-1)
			{
				s1=s1+s.charAt(i);
			}
			else
			{
				s2=s.charAt(i)+s2;
			}
				
		}
		System.out.println(s1+s2);
	}
}
