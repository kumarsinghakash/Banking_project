package com.jspiders;

public class StringDemo5 {
	public static void main(String[] args)
	{
		String s="AkAsH@SInGH";
		String ans="";
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(c>='a'&&c<='z')
			{
				c-=32;
			}
			else if(c>='A'&&c<='Z')
			{
				c+=32;
			}
			ans=ans+c;
		}
		System.out.println(ans);		
	}

}
