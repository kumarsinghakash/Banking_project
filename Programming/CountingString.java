package com.jspiders;

public class CountingString {
	public static void main(String[] args) {
		String s="hello how are you guys";
		int j=1;
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(c==32)
			{
				j++;
			}
		}
		System.out.println(j);
	}
}
