package com.jspiders;

public class PanadromeString {
	public static void main(String[] args)
	{
		String s="leveL";
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		if(s.equalsIgnoreCase(s))
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not a Plindrome");
		}
	}
}
