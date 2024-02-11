package com.jspiders;

public class StringIntoChar {
	public static void main(String[] args) {
		String s="hello";
		char[] arr=s.toCharArray();//it will return char arr of all the string
// -->first rule
//		int size=s.length();
//		char[] arr=new char[size];
//		for(int i=0;i<s.length();i++)
//		{
//			arr[i]=s.charAt(i);//System.out.println(s.charAt(i));
//		}
//-->Second rule
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}
}
