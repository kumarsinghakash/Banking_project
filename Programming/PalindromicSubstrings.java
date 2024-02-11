package com.jspiders;

public class PalindromicSubstrings {
	public static boolean  palindrome(String arr)
	{
		String rev="";
		for(int i=0;i<arr.length();i++)
		{
			rev=rev+arr.charAt(i);
		}
		return arr.equals(rev);
	}
	
	public static void main(String[] args) {
		String s="abbahjhcd";		
		for(int i=0;i<s.length();i++)
		{
			String  temp1=""+s.charAt(i);
			for(int j=i+1;j<s.length();j++)
			{
				temp1=temp1+s.charAt(j);
				//System.out.println(temp1);
				if(palindrome(temp1)) {
					System.out.println(temp1);
				}
			}
		}
	}
}
