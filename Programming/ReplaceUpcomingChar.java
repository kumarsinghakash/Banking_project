package com.jspiders;

public class ReplaceUpcomingChar {
	public static void main(String[] args) {
		String s="NanDi";
		char[] arr=new char[s.length()];
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(c=='z')
			{
				c='a';
			}
			else if(c=='Z')
			{
				c='A';
			}
			else
			{
				c+=1;
			}
			arr[i]=c;
			
		}
		String s1=new String(arr);
		System.out.println(s1);
	}
}
