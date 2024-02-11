package com.jspiders;
//str-->"ty08dp&uih*y;
//o/p-->"yh08iu&pdy*t;
public class ReverseOnlyString {
	public static void main(String[] args) {
		String s="ty08dp&uih*y";
		String alpha="",ans="";
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if((c>='a'&&c<='z')||(c>='A'&&c<='Z'))
			{
				alpha=c+alpha;
			}
		}
		//System.out.println(alpha);
		int k=0;
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if((c>='a'&&c<='z')|| (c>='A'&&c<='Z'))
			{
				ans=ans+alpha.charAt(k);
				k++;
			}
			else
			{
				ans=ans+c;
			}
		}
		System.out.println(ans);
	}
}
