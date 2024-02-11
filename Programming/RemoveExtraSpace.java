package com.jspiders;

public class RemoveExtraSpace {
	public static void main(String[] args)
	{
		String s="how   are  you";
		String addstr="";
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==' '&&s.charAt(i+1)==' ')
			{
				continue;
			}
			else
			{
				addstr=addstr+s.charAt(i);
			}
		}
		System.out.println(addstr);
	}
}

