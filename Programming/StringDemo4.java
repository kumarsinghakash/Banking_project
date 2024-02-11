package com.jspiders;

public class StringDemo4 {
	public static void main(String[] args)
	{
		String s="ahd1er@1r2";
		String a="",n="",sc="";
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if((c>='a'&&c<='z')||(c>='A'&&c<='Z'))
			{
				a=a+c;
			}
			else if(c>='0'&&c<='9')
			{
				n=n+c;
			}
			else {
				sc=sc+c;
			}
		}
		System.out.println(a+n+sc);
	}
}
