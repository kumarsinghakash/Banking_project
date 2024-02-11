package com.jspiders;
//Print vowels in string

public class StringDemo3 {
	public static void main(String[] args)
	{
		String v="aeioZAkash";
		int n=0;
		for(int i=0;i<v.length();i++)
		{
			char c=v.charAt(i);
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
			{
				n++;
			}
		}
		System.out.println(n);
	}
}
