package com.jspiders;
//Reverse word without reversing string sentence
//str-->"hello hi how are you guys";
//o/p-->"olleh ih woh era uoy syug";
public class ReverseWordOfString {
	public static String Reverse(String s)
	{
		//char[] arr=s.toCharArray();
		String s1="";
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			s1=c+s1;
		}
		return s1;
	}
	public static void main(String[] args) {
		String s="hello hi how are you guys";
		String s1="";
		String[] arr=s.split(" ");
		for(String a:arr)
		{
			s1=s1+" "+Reverse(a);
		}
		System.out.println(s1);
	}
}
