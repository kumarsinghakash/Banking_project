package com.jspiders;
//write a java program  to count alphabet ,numeric
//and special character in given string
public class StringDemo2 {
	public static void main(String[] args) {
		String s="Ak@123";
		int a=0,n=0,sc=0;
		for(int i=0;i<s.length();i++)
		{
			//char c=s.charAt(i);
			if((s.charAt(i)>=65&&s.charAt(i)<=90)||(s.charAt(i)>=97&&s.charAt(i)<=122))
			{
				a++;
			}
		}
		System.out.println(a);
	}
}
