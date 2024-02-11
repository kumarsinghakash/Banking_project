package com.jspiders;
//=================first case=====================
//s1="hello";
//s2="loleh";
//o/p=Anagram;
//==================Second case====================
//s1="hello";
//s2="lolehd";
//o/p=not a Anagram;

public class Anagram {
	static String sort(String s)
	{
		char[] arr=s.toCharArray();
		for(int i=0;i<s.length();i++)
		{
			for(int j=i+1;j<s.length();j++)
			{
				if(arr[i]>arr[j])
				{
					char temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		String s1=new String(arr);
		return s1;
	}
	public static void main(String[] args) {
		String s1="hello";
		String s2="loleh";
		s1=sort(s1);
		s2=sort(s2);
		if(s1.equals(s2))
		{
			System.out.println("Anagram");
		}
		else
		{
			System.out.println("Not a Anagram");
		}
		
		System.out.println(s1+" "+s2);
	}
}
